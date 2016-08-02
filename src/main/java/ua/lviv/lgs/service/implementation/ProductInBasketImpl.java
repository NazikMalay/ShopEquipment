package ua.lviv.lgs.service.implementation;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.BasketDao;
import ua.lviv.lgs.dao.ProductDao;
import ua.lviv.lgs.dao.ProductInBasketDao;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.dto.ProductFormDTO;
import ua.lviv.lgs.dto.ProductInBasketDTO;
import ua.lviv.lgs.entity.Basket;
import ua.lviv.lgs.entity.Product;
import ua.lviv.lgs.entity.ProductInBasket;
import ua.lviv.lgs.entity.User;
import ua.lviv.lgs.service.ProductInBasketService;

@Service
public class ProductInBasketImpl implements ProductInBasketService {

	@Autowired
	private ProductInBasketDao productInBasketDao;

	@Autowired
	private ProductDao productDao;

	@Autowired
	private BasketDao basketDao;

	@Autowired
	private UserDao userDao;

	@Transactional
	public void addNewProductInBasket(String amount, String idProduct, String idUser) {

		User user = userDao.findOne(Integer.parseInt(idUser));
		System.out.println(user);

		Product product = productDao.findOne(Integer.parseInt(idProduct));
		System.out.println(product);

		Basket myBasket = new Basket();
		System.out.println(myBasket);
		System.out.println("myBasket 1");

		List<Basket> list = basketDao.findAll();
		System.out.println("basketList" + list);
		for (Basket basket : list) {
			if (basket.getIdUser().equals(user)) {
				myBasket = basket;
			}
		}
		System.out.println("myBasket after foreach");
		System.out.println(myBasket);

		Basket basket = basketDao.findByUser(Integer.parseInt(idUser));
		System.out.println("===============");
		System.out.println(basket);
		if (basket == null) {
			System.out.println("basket == null , nead create new Basket!");
			myBasket.setIdUser(user);
			basketDao.saveAndFlush(myBasket);
			myBasket = basketDao.findByUser(Integer.parseInt(idUser));
			System.out.println("=======================================");
			System.out.println("my basket after findByUserId " + myBasket);
		}
		/*
		 * // if(myBasket.getIdBusket() == null){ //
		 * System.out.println("basket == null , nead create new Basket!"); //
		 * myBasket.setIdUser(user); // basketDao.saveAndFlush(myBasket); //
		 * myBasket = basketDao.findByUser(Integer.parseInt(idUser)); //
		 * System.out.println("======================================="); //
		 * System.out.println("my basket after findByUserId " + myBasket); // }
		 * //
		 */
		ProductInBasket productInBasket = new ProductInBasket(Integer.parseInt(amount), product, myBasket);
		productInBasketDao.saveAndFlush(productInBasket);
		System.out.println("Saved prod in bask " + productInBasket);

	}

	@Transactional
	public List<ProductInBasket> getAllProductInBasket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<ProductInBasketDTO> getAllProductByUserBasket(int idBasket) {
		List<ProductInBasketDTO> endList = new ArrayList<ProductInBasketDTO>();

		List<ProductInBasket> listWithAll = productInBasketDao.findAll();

		for (ProductInBasket productInBasket : listWithAll) {
			if (productInBasket.getIdBasket().getIdBusket().equals(idBasket)) {
				ProductFormDTO productFormDTO = new ProductFormDTO(productInBasket.getIdProduct().getProductId(),
						productInBasket.getIdProduct().getModel(),
						productInBasket.getIdProduct().getFirm().getFirmName(),
						productInBasket.getIdProduct().getPrice(), productInBasket.getIdProduct().getAmountAvailable());
				String image = Base64.getEncoder().encodeToString(productInBasket.getIdProduct().getImage());
				productFormDTO.setImage(image);
				ProductInBasketDTO basketDTO = new ProductInBasketDTO(productInBasket.getIdProductInBusket(),
						productInBasket.getAmount(), productInBasket.getIdBasket(), productFormDTO);

				endList.add(basketDTO);
			}
		}
		System.out.println("endlist after foreach" + endList);

		return endList;
	}

	@Transactional
	public void dellProdInBasket(Integer idProductInBasket) {
		productInBasketDao.delete(idProductInBasket);;

	}

	@Transactional
	public ProductInBasket findById(int idProdInBasket) {
		return productInBasketDao.findOne(idProdInBasket);
	}

}

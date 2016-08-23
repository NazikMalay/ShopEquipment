package ua.lviv.lgs.service.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ua.lviv.lgs.dao.FirmDao;
import ua.lviv.lgs.dao.ProductDao;
import ua.lviv.lgs.dao.ProductTypeDao;
import ua.lviv.lgs.dto.ProductFormDTO;
import ua.lviv.lgs.dto.SingleProductDTO;
import ua.lviv.lgs.entity.Product;
import ua.lviv.lgs.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private static final int PAGE_SIZE = 5;

	@Autowired
	private ProductDao productDao;

	@Autowired
	private FirmDao firmDao;

	@Autowired
	private ProductTypeDao productTypeDao;

	@Transactional
	public void addProduct(String model, String weight, String size, String amounAvailable, String prise, String idFirm,
			String idProductType, MultipartFile file) {
		Product product = new Product(model, weight, size, Integer.parseInt(amounAvailable), Integer.parseInt(prise));
		product.setFirm(firmDao.findOne(Integer.parseInt(idFirm)));
		product.setIdTypeProduct(productTypeDao.findOne(Integer.parseInt(idProductType)));
		try {
			product.setImage(file.getBytes());
		} catch (IOException e) {
			product.setImage(new byte[1]);
		}

		productDao.save(product);
	}

	@Transactional
	public void dellProduct(String model, String firmName) {
		for (Product product : productDao.findAll()) {
			if (product.getModel().equalsIgnoreCase(model)
					&& product.getFirm().getFirmName().equalsIgnoreCase(firmName)) {
				productDao.delete(product);
			}
		}

	}

	@Transactional
	public List<Product> getAllProduct() {
		return productDao.findAll();
	}

	@Transactional
	public Page<ProductFormDTO> getProductPage(Integer pageNumber) {
		List<ProductFormDTO> listProductDTO = new ArrayList<ProductFormDTO>();

		Pageable request = new PageRequest(pageNumber - 1, PAGE_SIZE);

		Page<Product> page = productDao.findAll(request);
		System.out.println(page.getSize() + " --SIZE");
		for (Product product : page.getContent()) {
			ProductFormDTO productDTO = new ProductFormDTO(product.getProductId(), product.getModel(),
					product.getFirm().getFirmName(), product.getPrice(), product.getAmountAvailable());
			String image = Base64.getEncoder().encodeToString(product.getImage());
			productDTO.setImage(image);
			listProductDTO.add(productDTO);

			System.out.println(product.toString());

		}
		return new PageImpl<ProductFormDTO>(listProductDTO, request, page.getTotalElements());
	}

	@Transactional
	public Page<ProductFormDTO> getProductPage(Integer pageNumber, String searchName) {
		List<ProductFormDTO> listProductDTO = new ArrayList<ProductFormDTO>();

		Pageable request = new PageRequest(pageNumber - 1, PAGE_SIZE);

		Page<Product> page = productDao.getSearchList(searchName, request);

		for (Product product : page.getContent()) {
			ProductFormDTO productDTO = new ProductFormDTO(product.getProductId(), product.getModel(),
					product.getFirm().getFirmName(), product.getPrice(), product.getAmountAvailable());
			String image = Base64.getEncoder().encodeToString(product.getImage());
			productDTO.setImage(image);
			listProductDTO.add(productDTO);

		}
		System.out.println("quit with service");
		return new PageImpl<ProductFormDTO>(listProductDTO, request, page.getTotalElements());
	}

	@Transactional
	public SingleProductDTO getSingleProduct(Integer productId) {
		Product product = productDao.findOne(productId);
		SingleProductDTO productDTO = new SingleProductDTO(product.getProductId(), product.getModel(),
				product.getWeight(), product.getSize(), product.getAmountAvailable(), product.getPrice(),
				firmDao.findOne(product.getFirm().getIdFirm()).getFirmName(),
				productTypeDao.findOne(product.getIdTypeProduct().getIdTypeProduct()).getTypeName());

		String image = Base64.getEncoder().encodeToString(product.getImage());
		productDTO.setImage(image);
		return productDTO;
	}

	@Transactional
	public List<ProductFormDTO> getProductList() {
		List<ProductFormDTO> listProductDTO = new ArrayList<ProductFormDTO>();

		List<Product> page = productDao.findAll();
		for (Product product : page) {
			ProductFormDTO productDTO = new ProductFormDTO(product.getProductId(), product.getModel(),
					product.getFirm().getFirmName(), product.getPrice(), product.getAmountAvailable());
			listProductDTO.add(productDTO);

		}
		return listProductDTO;
	}

	public void changeImage(String idProduct, MultipartFile file) {
		Product product = productDao.findOne(Integer.parseInt(idProduct));
		try {
			product.setImage(file.getBytes());
		} catch (IOException e) {

			e.printStackTrace();
		}
		productDao.saveAndFlush(product);
	}

	@Transactional
	public void dellProductOnId(String idProduct) {
		productDao.delete(productDao.findOne(Integer.parseInt(idProduct)));

	}

}

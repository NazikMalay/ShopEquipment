package ua.lviv.lgs.service;
import java.util.List;

import ua.lviv.lgs.dto.ProductInBasketDTO;
import ua.lviv.lgs.entity.ProductInBasket;
public interface ProductInBasketService {
		
		 void addNewProductInBasket(String amount, String product, String idUser);
		 
		 public List<ProductInBasketDTO> getAllProductByUserBasket(int idBasket);
		 
		 public void dellProdInBasket(Integer idProductInBasket);
		 
		 public ProductInBasket findById(int idProdInBasket);

	}



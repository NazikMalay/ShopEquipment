package ua.lviv.lgs.service;
import java.util.List;

import ua.lviv.lgs.entity.ProductInBasket;
public interface ProductInBasketService {
		
		 void addNewProductInBasket(String amount, String product, String idUser);
		 
		 public List<ProductInBasket> getAllProductInBasket();

	}



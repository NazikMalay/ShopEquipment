package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.lviv.lgs.service.ProductInBasketService;


@Controller
public class ProductInBasketController {
	
	@Autowired
	private ProductInBasketService productInBasketService;
	
	
	@RequestMapping(value="/dellProductFromBasket={idProductInBasket}", method = RequestMethod.GET)
	public String dellProductInBasket(@PathVariable("idProductInBasket") int idProductInBasket){
		
		productInBasketService.dellProdInBasket(idProductInBasket);
		
		
		
		return "redirect:userBasket";
	}
	
	
	

}

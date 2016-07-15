package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lgs.entity.User;
import ua.lviv.lgs.service.ProductInBasketService;
import ua.lviv.lgs.service.UserService;

@Controller
public class BasketController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductInBasketService productInBasketService;

	@RequestMapping(value = "/addProductToCart", method = RequestMethod.POST)
	public String addProductToBusket(
			@RequestParam("idProduct") String idProduct) {
		try {
			System.out.println("addProductToBusket");
			Authentication auth = SecurityContextHolder.getContext()
					.getAuthentication();
			User user = userService.findByLogin(auth.getName());
			System.out.println(user.getIdUser().toString());
			productInBasketService.addNewProductInBasket("1" , idProduct, user.getIdUser().toString());
			
		} catch (NullPointerException e) {
			System.out.println("NULLPOIN ");
		}
		
		
		return "redirect:product-product";

	}

	

}

package ua.lviv.lgs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lgs.dto.ProductInBasketDTO;
import ua.lviv.lgs.entity.Basket;
import ua.lviv.lgs.entity.User;
import ua.lviv.lgs.service.BasketService;
import ua.lviv.lgs.service.ProductInBasketService;
import ua.lviv.lgs.service.UserService;

@Controller
public class BasketController {

	@Autowired
	private UserService userService;

	@Autowired
	private ProductInBasketService productInBasketService;

	@Autowired
	private BasketService basketService;

	@RequestMapping(value = "/addProductToCart", method = RequestMethod.POST)
	public String addProductToBusket(@RequestParam("idProduct") String idProduct) {
		try {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			User user = userService.findByLogin(auth.getName());
			productInBasketService.addNewProductInBasket("1", idProduct, user.getIdUser().toString());

		} catch (NullPointerException e) {
			System.out.println("NULLPOIN /addProductToCart");
		}

		return "redirect:product-product";

	}

	@RequestMapping(value = "/userBasket", method = RequestMethod.GET)
	public String getUserBasket(Model model) {
		try {

			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			User user = userService.findByLogin(auth.getName());
			Basket basket = basketService.getBasketByUserId(user.getIdUser());
			List<ProductInBasketDTO> list = productInBasketService.getAllProductByUserBasket(basket.getIdBusket());
			model.addAttribute("allProductinBasketOneUserList", list);
		} catch (NullPointerException e) {
			System.out.println("NULLPOIN /userBasket");
		}

		return "basket-userBasket";
	}

}

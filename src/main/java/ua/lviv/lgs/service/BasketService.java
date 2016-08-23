package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.entity.Basket;
import ua.lviv.lgs.entity.User;

public interface BasketService {

	void addBasket(User user);

	void dellBasket(User user);

	List<Basket> getAllBasket();

	Basket getBasketByUserId(int userId);

}

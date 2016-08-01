package ua.lviv.lgs.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.BasketDao;
import ua.lviv.lgs.entity.Basket;
import ua.lviv.lgs.entity.User;
import ua.lviv.lgs.service.BasketService;


@Service
public class BasketServiceImpl implements BasketService{

	@Autowired
	private BasketDao basketDao;

	public void addBasket(User user) {
	Basket basket = new Basket(user);
	basketDao.saveAndFlush(basket);
	}

	public void dellBasket(User user) {
		Basket basket = basketDao.findByUser(user.getIdUser());
		basketDao.delete(basket);
		
	}

	public List<Basket> getAllBasket() {
		return basketDao.findAll();
	}

	public Basket getBasketByUserId(int userId) {
		return basketDao.findByUser(userId);
	}


	
	
	
}

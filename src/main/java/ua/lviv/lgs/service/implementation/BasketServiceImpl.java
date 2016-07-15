package ua.lviv.lgs.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.BasketDao;
import ua.lviv.lgs.entity.Basket;
import ua.lviv.lgs.entity.User;
import ua.lviv.lgs.service.BasketService;


@Service
public class BasketServiceImpl implements BasketService{

	@Autowired
	private BasketDao basketDao;

	public void addBasket(User user) {
		// TODO Auto-generated method stub
		
	}

	public void dellBasket(User user) {
		// TODO Auto-generated method stub
		
	}

	public List<Basket> getAllBasket() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Transactional
//	public Basket findBasketByUserId(String userId) {
//		
//		return basketDao.findByUser(userId);
//	}
	
	
	
}

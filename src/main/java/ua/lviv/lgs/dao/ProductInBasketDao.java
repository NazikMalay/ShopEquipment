package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.entity.ProductInBasket;

public interface ProductInBasketDao extends JpaRepository<ProductInBasket, Integer> {

	
//	@Query("SET FOREIGN_KEY_CHECKS = 0" + "DELETE FROM ProductInBasket a WHERE a.idProductInBusket like :idProductInBusket" + "SET FOREIGN_KEY_CHECKS = 1")
//	public void deletById(String idProductInBusket);
}

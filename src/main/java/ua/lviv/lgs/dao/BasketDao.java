package ua.lviv.lgs.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.lviv.lgs.entity.Basket;

public interface BasketDao extends JpaRepository<Basket, Integer> {

	
	
	
	
	@Query("select a from Basket a left join a.idUser b where b.idUser like :idUser")
	Basket findByUser(@Param("idUser") Integer idUser);
	
}

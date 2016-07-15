package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.entity.ProductType;

public interface ProductTypeDao extends JpaRepository<ProductType, Integer> {

	
	
}

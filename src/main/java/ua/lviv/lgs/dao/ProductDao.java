package ua.lviv.lgs.dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.lviv.lgs.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

	@Query("SELECT a FROM Product a left join a.idFirm b " +
	"where a.model like %:nameSearch% or b.firmName like %:nameSearch%")
	List<Product> getSearchList(@Param("nameSearch") String nameSearch);
	
	@Query("SELECT a FROM Product a left join a.idFirm b " +
			"where a.model like %:nameSearch% or b.firmName like %:nameSearch%")
			Page<Product> getSearchList(@Param("nameSearch") String nameSearch, Pageable pageable);
	
	@Query
	List<Product> findByModel(String model);

	@Query
	Page<Product> findByModel(String searchName,
			Pageable request);
		
}

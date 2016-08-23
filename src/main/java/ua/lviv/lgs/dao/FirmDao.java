package ua.lviv.lgs.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.lviv.lgs.entity.Firm;

public interface FirmDao extends JpaRepository<Firm, Integer> {

	@Query("select b from Firm b where b.idFirm like :idFirm")
	Firm findById(@Param("idFirm") Integer idFirm);
	
	
}

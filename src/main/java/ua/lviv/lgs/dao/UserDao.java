package ua.lviv.lgs.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.lviv.lgs.entity.User;

public interface UserDao extends JpaRepository<User, Integer>  {
	

	
	
	@Query("select a from User a where a.nickName like :nickName")
	User findByLogin(@Param("nickName") String nickName);
	
	
}

package ua.lviv.lgs.service;


import org.springframework.data.domain.Page;

import ua.lviv.lgs.entity.User;

public interface UserService {

	void addUser(String name, String surname,String nickName, String email, String password, int numberPhone);
	
	void dellUser(String userName, String surname);
	
	User findUser(String name, String surname);
	
	User findOneUserName(int id);
	
	//List<User> getAllUser();
	
	public Page<User> getAllUsers(Integer pageNamber);
	
	public User findByLogin(String nickName);
}

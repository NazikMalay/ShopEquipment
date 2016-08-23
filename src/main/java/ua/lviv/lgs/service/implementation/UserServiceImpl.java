package ua.lviv.lgs.service.implementation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entity.User;
import ua.lviv.lgs.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	private static final int PAGE_SIZE = 5;
	
	@Transactional
	public void addUser(String name, String surname, String nickName,
			String email, String password, int numberPhone) {
		User user = new User(name, surname, nickName, email,
				numberPhone);
		BCryptPasswordEncoder pass = new BCryptPasswordEncoder();
		
		user.setPassword(pass.encode(password));
		userDao.saveAndFlush(user);

	}

	@Transactional
	public User findUser(String name, String surname) {
		User user = new User();
		for (User user1 : userDao.findAll()) {
			if (user1.getName().equalsIgnoreCase(name)
					&& user1.getSurname().equalsIgnoreCase(surname)) {
				user = user1;
			}
		}
		return user;
	}

//	@Transactional
//	public List<User> getAllUser() {
//		return userDao.findAll();
//	}
	
	//PAGINATION
	@Transactional
	public Page<User> getAllUsers(Integer pageNumber){
		Pageable request = new PageRequest(pageNumber - 1, PAGE_SIZE, Sort.Direction.DESC, "name");
		return userDao.findAll(request);
	}
	
	
	
	

	@Transactional
	public void dellUser(String userName, String surname) {
		for (User user1 : userDao.findAll()) {
			if (user1.getName().equalsIgnoreCase(userName)
					&& user1.getSurname().equalsIgnoreCase(surname)) {
				userDao.delete(user1);
			}

		}

	}

	@Transactional
	public User findOneUserName(int id) {
		User user = userDao.getOne(id);
		return user;
	}
	
	@Transactional
	public User findByLogin(String nickName){ 
		User user = userDao.findByLogin(nickName);
		return user;
	}
	
	
}

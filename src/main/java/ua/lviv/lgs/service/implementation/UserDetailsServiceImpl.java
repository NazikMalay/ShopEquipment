package ua.lviv.lgs.service.implementation;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.UserDao;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Transactional
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		ua.lviv.lgs.entity.User user = null;
		try {
			user = userDao.findByLogin(login);
		} catch (NoResultException e) {
			System.out.println("No user found for username " + login + "'.");
			return null;
		}

		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return new User(String.valueOf(user.getNickName()), user.getPassword(), authorities);
	}

}

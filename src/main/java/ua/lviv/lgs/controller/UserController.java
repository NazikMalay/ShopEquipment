package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lgs.entity.User;
import ua.lviv.lgs.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user={pageNumber}", method = RequestMethod.GET)
	public String getUserPage(@PathVariable("pageNumber") Integer pageNumber, Model model) {
		Page<User> page = userService.getAllUsers(pageNumber);

		int current = page.getNumber() + 1;
		int begin = Math.max(1, current - 5);
		int end = Math.min(begin + 10, page.getTotalPages());

		model.addAttribute("user", page.getContent());
		model.addAttribute("users", page);
		model.addAttribute("beginIndex", begin);
		model.addAttribute("endIndex", end);
		model.addAttribute("currentIndex", current);

		return "user-getAllUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String createUser1(@RequestParam("name") String name, @RequestParam("surname") String surname,
			@RequestParam("nickName") String nickName, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("numberPhone") String numberPhone) {
		try {
			System.out.println("Start add user");
			userService.addUser(name, surname, nickName, email, password, Integer.parseInt(numberPhone));
			System.out.println("user added");

		} catch (NumberFormatException e) {
			System.out.println(" NumberFormatException in createUser1");
		} catch (NullPointerException e) {
			System.out.println("NullPoint!!");
		}
		return "loginpage";
	}

	@RequestMapping(value = "/addNewUserPage")
	public String createUserPage1() {

		return "user-registUser";
	}
}

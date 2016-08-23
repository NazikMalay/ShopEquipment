package ua.lviv.lgs.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ua.lviv.lgs.dto.SingleProductDTO;
import ua.lviv.lgs.service.ProductService;


@Controller
public class HomeController {

	
	@Autowired
	private ProductService productService;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
//test json
	@RequestMapping(value = "home")
	public String home1() {
		//(Principal principal, Model model)
//		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		String b = auth.getName();
//		System.out.println(b + " b");
//		model.addAttribute("a", b);
		return "home";
	}

	@RequestMapping(value = "/loginpage")
	public String loginPage() {
		return "loginpage";
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	@ResponseBody
	  public  SingleProductDTO getTime(@RequestParam("id") Integer id) {
		
		SingleProductDTO prod = productService.getSingleProduct(id);
		return prod;
	    
	  }
	
	


}

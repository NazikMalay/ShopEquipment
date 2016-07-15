package ua.lviv.lgs.controller;
//package ua.lviv.lgs.controller;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//
//import ua.lviv.lgs.entity.Firm;
//import ua.lviv.lgs.service.FirmService;
//
//
//@Controller
//public class FirmController {
//
//	@Autowired
//	private FirmService firmService;
//	
//	@RequestMapping(value="addNewFirm", method = RequestMethod.POST)
//	public String createNewFirm(@ModelAttribute(value = "firmObject") Firm firm){
//			firmService.addFirm(firm.getFirmName());
//			return "product-addProduct";
//	}
//	
//	@RequestMapping(value="addFirm")
//	public String createPageStringAddFirm(Model model, HttpServletRequest request){
//		if (request.isUserInRole("ROLE_ADMIN")) {
//			model.addAttribute("firmObject", new Firm());
//			return "product-addProduct";
//		} else {
//			return "redirect:home";
//		}
//	}
//	
//	
//}

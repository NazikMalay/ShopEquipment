package ua.lviv.lgs.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.lviv.lgs.dto.ProductFormDTO;
import ua.lviv.lgs.dto.SingleProductDTO;
import ua.lviv.lgs.service.FirmService;
import ua.lviv.lgs.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	@Autowired
	private FirmService firmService;

	
	
	@RequestMapping(value = "/productPage={pageNumber}", method = RequestMethod.GET)
	public String showAllProduct(
			@PathVariable("pageNumber") Integer pageNumber,@RequestParam(value = "searchName", required = false) String searchName ,Model model) {
	
		 Page<ProductFormDTO> page = productService.getProductPage(pageNumber, searchName);
	
		
		
		int current = page.getNumber() + 1;
		int begin = Math.max(1, current - 5);
		int end = Math.min(begin + 5, page.getTotalPages());

		model.addAttribute("productList", page.getContent());
		model.addAttribute("products", page);
		model.addAttribute("beginIndex", begin);
		model.addAttribute("endIndex", end);
		model.addAttribute("currentIndex", current);
		model.addAttribute("searchName", searchName);

		return "product-product";
	}
	
	
	
	


	//get single page product
	@RequestMapping(value="/productSingle={idProduct}")
	public String showSingleProduct(@PathVariable Integer idProduct, Model model){
		SingleProductDTO product = productService.getSingleProduct(idProduct);
		model.addAttribute("productObject", product);
		
		return "product-singleProduct";
	}
	
	
	
}

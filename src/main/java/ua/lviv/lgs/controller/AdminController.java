package ua.lviv.lgs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.lviv.lgs.dto.ProductFormDTO;
import ua.lviv.lgs.entity.Firm;
import ua.lviv.lgs.entity.Product;
import ua.lviv.lgs.entity.ProductType;
import ua.lviv.lgs.service.FirmService;
import ua.lviv.lgs.service.ProductService;
import ua.lviv.lgs.service.ProductTypeService;

@Controller
public class AdminController {

	@Autowired
	private FirmService firmService;

	@Autowired
	private ProductTypeService productTypeService;

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "adddProduct")
	public String createPage(Model model) {
		List<Firm> firmsList = firmService.getAllFirms();
		model.addAttribute("allFirms", firmsList);
		List<ProductType> productTypeList = productTypeService.getAllProductType();
		model.addAttribute("allProductType", productTypeList);

		return "product-addProduct";
	}

	@RequestMapping(value = "adminPage")
	public String createPageStringAddFirm(Model model, HttpServletRequest request) {
		if (request.isUserInRole("ROLE_ADMIN")) {
			List<ProductFormDTO> productList = productService.getProductList();
			model.addAttribute("productList", productList);
			model.addAttribute("firmObject", new Firm());
			List<Firm> firmsList = firmService.getAllFirms();
			model.addAttribute("allFirms", firmsList);
			model.addAttribute("productObject", new Product());
			List<ProductType> productTypeList = productTypeService.getAllProductType();
			model.addAttribute("allProductType", productTypeList);
			model.addAttribute("productTypeObject", new ProductType());

			return "product-productAdmin";
		} else {
			return "redirect:home";
		}
	}

	@RequestMapping(value = "addNewFirm", method = RequestMethod.POST)
	public String createNewFirm(@ModelAttribute(value = "firmObject") Firm firm) {
		firmService.addFirm(firm.getFirmName());
		return "redirect:adminPage";
	}

	@RequestMapping(value = "dellFirm", method = RequestMethod.POST)
	public String dellFirm(@RequestParam("firm") String firmId) {
		firmService.dellFirmId(Integer.parseInt(firmId));
		return "redirect:adminPage";
	}

	@RequestMapping(value = "addNewProductType", method = RequestMethod.POST)
	public String addProductType(@ModelAttribute(value = "productTypeObject") ProductType productType) {
		productTypeService.addProductType(productType.getTypeName());
		return "redirect:adminPage";
	}

	@RequestMapping(value = "dellProductType", method = RequestMethod.POST)
	public String dellProductType(@RequestParam("productType") String typeId) {
		productTypeService.dellProductTypeId(Integer.parseInt(typeId));
		return "redirect:adminPage";
	}

	@RequestMapping(value = "/createProduct", method = RequestMethod.POST)
	public String createProduct(@RequestParam("model") String model, @RequestParam("productType") String idTypeProduct,
			@RequestParam("weight") String weight, @RequestParam("size") String size,
			@RequestParam("amounAvailable") String amounAvailable, @RequestParam("prise") String price,
			@RequestParam("firm") String firm, @RequestParam("image") MultipartFile file) {

		productService.addProduct(model, weight, size, amounAvailable, price, firm, idTypeProduct, file);
		return "redirect:adminPage";
	}

	@RequestMapping(value = "changeImage", method = RequestMethod.POST)
	public String changeImage(@RequestParam("image") MultipartFile file, @RequestParam("productId") String productId) {
		productService.changeImage(productId, file);

		return "redirect:adminPage";
	}

	@RequestMapping(value = "deleteProduct", method = RequestMethod.POST)
	public String delProduct(@RequestParam("productId") String[] productId) {

		for (String string : productId) {
			productService.dellProductOnId(string.toString());
		}

		return "redirect:adminPage";
	}
}

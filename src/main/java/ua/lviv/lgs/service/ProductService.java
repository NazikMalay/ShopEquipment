package ua.lviv.lgs.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import ua.lviv.lgs.dto.ProductFormDTO;
import ua.lviv.lgs.dto.SingleProductDTO;
import ua.lviv.lgs.entity.Product;

public interface ProductService {

	void addProduct(String model, String weight, String size,
			String amounAvailable, String price, String idFirm , String idProductType, MultipartFile file);
	
	void dellProduct(String model, String firmName);
	
	public List<Product> getAllProduct();
	
	public Page<ProductFormDTO> getProductPage(Integer pageNumber);
	
	public Page<ProductFormDTO> getProductPage(Integer pageNumber,
			String searchName);
	
	public List<ProductFormDTO> getProductList();
	
	public SingleProductDTO getSingleProduct(Integer productId);
	
	public void changeImage(String idProduct, MultipartFile file);
	
	public void dellProductOnId(String idProduct);
}

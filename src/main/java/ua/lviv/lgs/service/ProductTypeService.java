package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.entity.ProductType;


public interface ProductTypeService {
	
	void addProductType(String typeName);
	
	void dellProductType(String typeName);
	
	ProductType getProductType(String typeName);
	
	List<ProductType> getAllProductType();
	
	void dellProductTypeId(Integer ProductTypeId);

}

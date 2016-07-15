package ua.lviv.lgs.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.ProductTypeDao;
import ua.lviv.lgs.entity.ProductType;
import ua.lviv.lgs.service.ProductTypeService;

@Service
public class ProductTypeServiceIml implements ProductTypeService {

	@Autowired
	private ProductTypeDao productTypeDao;
	
	@Transactional
	public void addProductType(String typeName) {
		ProductType productType = new ProductType();
		productType.setTypeName(typeName);
		productTypeDao.save(productType);
		
	}

	@Transactional
	public void dellProductType(String typeName) {
		ProductType productType = new ProductType();
		productType.setTypeName(typeName);
		productTypeDao.delete(productType);		
	}

	@Transactional
	public ProductType getProductType(String typeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<ProductType> getAllProductType() {
		return productTypeDao.findAll();
	}

	@Transactional
	public void dellProductTypeId(Integer ProductTypeId) {
		productTypeDao.delete(ProductTypeId);
		
	}

}

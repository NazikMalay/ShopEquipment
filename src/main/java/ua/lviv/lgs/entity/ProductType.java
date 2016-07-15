package ua.lviv.lgs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ProductType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTypeProduct;
	
	@Column
	private String typeName;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idTypeProduct")
	List<ProductType> idTypeProdutcs;
	
	public List<ProductType> getIdTypeProdutcs() {
		return idTypeProdutcs;
	}

	public void setIdTypeProdutcs(List<ProductType> idTypeProdutcs) {
		this.idTypeProdutcs = idTypeProdutcs;
	}

	public ProductType(String typeName) {
		super();
		this.typeName = typeName;
	}

	public ProductType() {
		super();
	}

	public Integer getIdTypeProduct() {
		return idTypeProduct;
	}

	public void setIdTypeProduct(Integer idTypeProduct) {
		this.idTypeProduct = idTypeProduct;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "TypeProdutc [idTypeProduct=" + idTypeProduct + ", typeName="
				+ typeName + ", idTypeProdutcs=" + idTypeProdutcs + "]";
	}
	
	
	
	
	
	
}

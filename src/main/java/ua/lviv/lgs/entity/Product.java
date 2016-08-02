package ua.lviv.lgs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;

	@Column
	private String model;

	@Column
	private String weight;

	@Column
	private String size;

	@Column
	private Integer amountAvailable;

	@Column
	private Integer price;

	@Lob
	private byte[] image;

	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	private Firm idFirm;

	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	private ProductType idTypeProduct;

	@OneToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY, mappedBy = "idProduct")
	List<ProductInBasket> idProductsList;

	public Product(String model, String weight, String size,
			Integer amounAvailable, Integer price) {
		super();
		this.model = model;
		this.weight = weight;
		this.size = size;
		this.amountAvailable = amounAvailable;
		this.price = price;
	}

	public Product() {
		super();
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getAmountAvailable() {
		return amountAvailable;
	}

	public void setAmountAvailable(Integer amountAvailable) {
		this.amountAvailable = amountAvailable;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Firm getFirm() {
		return idFirm;
	}

	public void setFirm(Firm firm) {
		this.idFirm = firm;
	}

	public ProductType getIdTypeProduct() {
		return idTypeProduct;
	}

	public void setIdTypeProduct(ProductType idTypeProduct) {
		this.idTypeProduct = idTypeProduct;
	}

	public List<ProductInBasket> getIdProductsList() {
		return idProductsList;
	}

	public void setIdProductsList(List<ProductInBasket> idProductsList) {
		this.idProductsList = idProductsList;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", model=" + model
				+ ", weight=" + weight + ", size=" + size
				+ ", amountAvailable=" + amountAvailable + ", price=" + price
				+ ", firm=" + idFirm.getFirmName() + ", idTypeProduct=" + idTypeProduct.getTypeName()
				+  "]";
	}
	
	
}

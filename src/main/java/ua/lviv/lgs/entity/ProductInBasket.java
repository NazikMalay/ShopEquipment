package ua.lviv.lgs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductInBasket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProductInBusket;
	
	@Column
	private Integer amount;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Product idProduct;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Basket idBasket;

	
	public ProductInBasket(Integer amount,
			Product idProduct, Basket idBasket) {
		super();
		this.amount = amount;
		this.idProduct = idProduct;
		this.idBasket = idBasket;
	}

	public ProductInBasket() {
		super();
	}

	public Integer getIdProductInBusket() {
		return idProductInBusket;
	}

	public void setIdProductInBusket(Integer idProductInBusket) {
		this.idProductInBusket = idProductInBusket;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Product getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Product idProduct) {
		this.idProduct = idProduct;
	}

	public Basket getIdBasket() {
		return idBasket;
	}

	public void setIdBasket(Basket idBasket) {
		this.idBasket = idBasket;
	}

	@Override
	public String toString() {
		return "ProductInBusket [idProductInBusket=" + idProductInBusket
				+ ", amount=" + amount + ", idProduct=" + idProduct
				+ ", idBasket=" + idBasket + "]";
	}
	
	
	
	
	
}

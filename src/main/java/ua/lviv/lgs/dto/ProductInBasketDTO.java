package ua.lviv.lgs.dto;

import ua.lviv.lgs.entity.Basket;

public class ProductInBasketDTO {

	private Integer idProductInBusket;

	private Integer amount;

	private Basket Basket;

	private ProductFormDTO product;

	public ProductInBasketDTO() {
	};

	public ProductInBasketDTO(Integer idProductInBusket, Integer amount, ua.lviv.lgs.entity.Basket basket,
			ProductFormDTO product) {
		super();
		this.idProductInBusket = idProductInBusket;
		this.amount = amount;
		Basket = basket;
		this.product = product;
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

	public Basket getBasket() {
		return Basket;
	}

	public void setBasket(Basket basket) {
		Basket = basket;
	}

	public ProductFormDTO getProduct() {
		return product;
	}

	public void setProduct(ProductFormDTO product) {
		this.product = product;
	}

}

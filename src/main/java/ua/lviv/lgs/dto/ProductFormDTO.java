package ua.lviv.lgs.dto;

public class ProductFormDTO {

	private int productId;

	private String model;

	private String firmName;

	private String image;

	private int price;

	private int amountAvailable;

	public ProductFormDTO(int productId, String model, String firmName, int price, int amountAvailable) {
		super();
		this.productId = productId;
		this.model = model;
		this.firmName = firmName;
		this.price = price;
		this.amountAvailable = amountAvailable;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmountAvailable() {
		return amountAvailable;
	}

	public void setAmountAvailable(int amountAvailable) {
		this.amountAvailable = amountAvailable;
	}

	@Override
	public String toString() {
		return "ProductFormDTO [productId=" + productId + ", model=" + model + ", firmName=" + firmName + ", image="
				+ image + ", price=" + price + ", amountAvailable=" + amountAvailable + "]";
	}

}

package ua.lviv.lgs.dto;

public class SingleProductDTO {

	private Integer productId;

	private String model;

	private String weight;

	private String size;

	private Integer amountAvailable;

	private Integer price;

	private String image;

	private String firm;

	private String type;

	public SingleProductDTO(Integer productId, String model, String weight, String size, Integer amountAvailable,
			Integer price, String firm, String type) {
		super();
		this.productId = productId;
		this.model = model;
		this.weight = weight;
		this.size = size;
		this.amountAvailable = amountAvailable;
		this.price = price;
		this.firm = firm;
		this.type = type;
	}

	public SingleProductDTO() {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

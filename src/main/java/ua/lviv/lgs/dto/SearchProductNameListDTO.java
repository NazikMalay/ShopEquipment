package ua.lviv.lgs.dto;

public class SearchProductNameListDTO {

	private Integer productId;

	private String model;

	private String firm;

	public SearchProductNameListDTO(Integer productId, String model, String firm) {
		super();
		this.productId = productId;
		this.model = model;
		this.firm = firm;
	}

	public SearchProductNameListDTO() {
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

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}

	@Override
	public String toString() {
		return "SearchProductNameListDTO [productId=" + productId + ", model=" + model + ", firm=" + firm + "]";
	}

}

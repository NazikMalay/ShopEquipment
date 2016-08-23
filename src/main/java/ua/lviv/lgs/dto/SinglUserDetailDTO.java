package ua.lviv.lgs.dto;

public class SinglUserDetailDTO {

	private String nickName;

	private int id;

	public SinglUserDetailDTO() {
		super();
	}

	public SinglUserDetailDTO(String nickName, int id) {
		super();
		this.id = id;
		this.nickName = nickName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}

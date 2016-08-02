package ua.lviv.lgs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQueries({
	@NamedQuery(name = "User.findById", query = "select a from User a where a.idUser like :idUser"),
	@NamedQuery(name = "User.findByName", query = "select a from User a where a.name like :name"),
	@NamedQuery(name = "User.findBySurname", query = "select a from User a where a.surname like :surname"),
	@NamedQuery(name = "User.findByNickName", query = "select a from User a where a.nickName like :nickName"),
	@NamedQuery(name = "User.findByEmail", query = "select a from User a where a.email like :email"),
	@NamedQuery(name = "User.findByPassword", query = "select a from User a where a.password like :password"),
	@NamedQuery(name = "User.findByNumberPhone", query = "select a from User a where a.numberPhone like :numberPhone")
})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUser;
	
	@Column(length = 50)
	private String name;
	
	
	@Column(length = 50)
	private String surname;
	
	@Column(length = 50, unique = true)
	private String nickName;
	
	@Column (length = 50,unique = true)
	private String email;
	
	@Column (length = 1000)
	private String password;
	
	@Column (length = 25,unique = true)
	private Integer numberPhone;

	@OneToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY, mappedBy = "idUser")
	List<Basket> id_User;
	
	public User(String name, String surname, String nickName, String email,
			 Integer numberPhone) {
		super();
		this.name = name;
		this.surname = surname;
		this.nickName = nickName;
		this.email = email;
		this.numberPhone = numberPhone;
	}

	public User() {
		super();
	}

	public Integer getIdUser() {
		return idUser;
	}


	public List<Basket> getIdBaskets() {
		return id_User;
	}

	public void setIdBaskets(List<Basket> id_User) {
		this.id_User = id_User;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(Integer numberPhone) {
		this.numberPhone = numberPhone;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", surname="
				+ surname + ", nickName=" + nickName + ", email=" + email
				+ ", password=" + password + ", numberPhone=" + numberPhone
				 + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

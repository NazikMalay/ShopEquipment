package ua.lviv.lgs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Basket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idBasket;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private User idUser;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idBasket")
	List<Basket> listBasket;
	
	
	public Basket(User idUser) {
		super();
		this.idUser = idUser;
	}

	public Basket() {
		super();
	}

	public Integer getIdBusket() {
		return idBasket;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

	@Override
	public String toString() {
		return "Basket [idBusket=" + idBasket + ", idUser=" + idUser + "]";
	}
	
	
	
	
	
}

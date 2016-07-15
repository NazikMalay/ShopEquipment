package ua.lviv.lgs.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPayment;
	
	@Column
	private Date paymentData;
	
	@Column
	private String commentary;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Basket idBasket;

	public Payment(String commentary, Basket idBasket) {
		super();
		this.paymentData = new Date();
		this.commentary = commentary;
		this.idBasket = idBasket;
	}
	public Payment(String commentary) {
		super();
		this.paymentData = new Date();
		this.commentary = commentary;
	}

	public Payment() {
		super();
	}

	public long getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(Integer idPayment) {
		this.idPayment = idPayment;
	}

	public Date getPaymentData() {
		return paymentData;
	}

	public void setPaymentData(Date paymentData) {
		this.paymentData = paymentData;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public Basket getIdBasket() {
		return idBasket;
	}

	public void setIdBasket(Basket idBasket) {
		this.idBasket = idBasket;
	}

	@Override
	public String toString() {
		return "Payment [idPayment=" + idPayment + ", paymentData="
				+ paymentData + ", commentary=" + commentary + ", idBasket="
				+ idBasket + "]";
	}
	
}

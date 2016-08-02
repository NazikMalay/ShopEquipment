package ua.lviv.lgs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Firm")
public class Firm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idFirm;
	
	@Column(length = 22)
	private String firmName;

	
	@OneToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY, mappedBy = "idFirm")
	List<Firm> idFirms;
	
	public Firm(String firmName) {
		super();
		this.firmName = firmName;
	}

	public Firm() {
		super();
	}

	public Integer getIdFirm() {
		return idFirm;
	}

	public void setIdFirm(Integer idFirm) {
		this.idFirm = idFirm;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public List<Firm> getIdFirms() {
		return idFirms;
	}

	public void setIdFirms(List<Firm> idFirms) {
		this.idFirms = idFirms;
	}

	@Override
	public String toString() {
		return "Firm [idFirm=" + idFirm + ", firmName=" + firmName
				+ ", idFirms=" + idFirms + "]";
	}
	
	
}

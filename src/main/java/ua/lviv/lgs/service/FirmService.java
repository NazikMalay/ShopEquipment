package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.entity.Firm;

public interface FirmService {

	void addFirm(String firmName);

	void dellFirm(String firmname);

	Firm getFirm(String name);

	List<Firm> getAllFirms();

	void dellFirmId(Integer firmId);

	String findNameById(Integer firmId);

}

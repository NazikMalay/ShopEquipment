package ua.lviv.lgs.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.lgs.dao.FirmDao;
import ua.lviv.lgs.entity.Firm;
import ua.lviv.lgs.service.FirmService;


@Service
public class FirmServiceImpl implements FirmService {

	
	@Autowired
	private FirmDao firmDao;
	
	@Transactional
	public void addFirm(String firmName) {
		Firm firm = new Firm(firmName);
		firmDao.save(firm);

	}

	@Transactional
	public void dellFirm(String firmname) {
		for (Firm firm : firmDao.findAll()) {
			if (firm.getFirmName().equalsIgnoreCase(firmname)) {
				firmDao.delete(firm);;
			}
		}

	}
	
	@Transactional
	public void dellFirmId(Integer firmId) {
		firmDao.delete(firmId);

	}

	@Transactional
	public Firm getFirm(String name) {
		Firm firm1 = new Firm();
		for (Firm firm : firmDao.findAll()) {
			if (firm.getFirmName().equalsIgnoreCase(name)) {
				firm1 = firm;
			}
		}
		if (firm1.getFirmName() == null) {
			System.out.println("firm does not exist ");
		}
			return firm1;
		
	}
	@Transactional
	public List<Firm> getAllFirms() {
		return firmDao.findAll();
	}
	@Transactional
	public String findNameById(Integer firmId) {
	
		return 	firmDao.findOne(firmId).getFirmName();
	}
		
	

}

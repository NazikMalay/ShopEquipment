package ua.lviv.lgs.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.PaymentDao;
import ua.lviv.lgs.entity.Basket;
import ua.lviv.lgs.entity.Payment;
import ua.lviv.lgs.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDao paymentDao;
	
	public void addPayment(String comment, Basket basket) {
		Payment payment = new Payment(comment, basket);
		paymentDao.save(payment);
	}

	public void dellPayment(Payment payment) {
		paymentDao.delete(payment);;

	}

	public List<Payment> getAllPayment() {
		return paymentDao.findAll();
	}

}

package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.entity.Basket;
import ua.lviv.lgs.entity.Payment;


public interface PaymentService {

	void addPayment(String comment, Basket basket);
	
	void dellPayment(Payment payment);
	
	List<Payment> getAllPayment();
	
}

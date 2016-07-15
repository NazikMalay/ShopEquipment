package ua.lviv.lgs.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.entity.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer> {

	
}

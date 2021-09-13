package com.kochmann.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.kochmann.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Alex", 200.0, days);
	}
}

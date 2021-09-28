package com.kochmann.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kochmann.hrpayroll.entities.Payment;
import com.kochmann.hrpayroll.entities.Worker;
import com.kochmann.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	
	public Payment getPayment(Long workerId, int days) {
		
		Worker obj = workerFeignClient.findById(workerId).getBody();
		return new Payment(obj.getName(), obj.getDailyIncome(), days);
	}
}

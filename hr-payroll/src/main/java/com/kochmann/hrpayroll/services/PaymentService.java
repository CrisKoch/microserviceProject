package com.kochmann.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kochmann.hrpayroll.entities.Payment;
import com.kochmann.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(Long workerId, int days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", "" + workerId);
		
		Worker obj = restTemplate.getForObject(workerHost +"/workers/{id}", Worker.class, uriVariables);
		
		
		return new Payment(obj.getName(), obj.getDailyIncome(), days);
	}
}

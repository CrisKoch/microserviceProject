package com.kochmann.hrworker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kochmann.hrworker.entities.Worker;
import com.kochmann.hrworker.repositories.WorkerRepository;



@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository repository;
	public List<Worker> findAll(){
		List<Worker> list = repository.findAll();
		return list;
	}
	public Worker findById(Long id) {
		Worker entity = repository.findById(id).get();
		return entity;
		
	}
}

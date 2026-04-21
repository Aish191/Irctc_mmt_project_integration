package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Train;

@Service
public class MmtTrainServiceImpl implements MmtTrainService{

	@Autowired
	RestTemplate restTemplate;
	
	
	@Override
	public ResponseEntity getAllTrains() {
		// TODO Auto-generated method stub
	ResponseEntity responseEntity= restTemplate.getForEntity("http://localhost:8080/trains",List.class);
	//List<Train> list=(List<Train> responseEntity.Body();	
		return responseEntity;
	}

}

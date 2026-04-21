package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Train;
import com.example.demo.service.MmtTrainService;

@RestController
public class MmtTrainController {

	@Autowired
	MmtTrainService mts;
	
	@GetMapping("mmt")
	ResponseEntity getAllTrain()
	{
	ResponseEntity<List> list =	mts.getAllTrains();
	return list;
	}
}

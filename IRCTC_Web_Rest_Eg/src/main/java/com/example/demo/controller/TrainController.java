package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Train;
import com.example.demo.service.TrainService;

@RestController
public class TrainController {

	@Autowired
	TrainService ts;
	
	@PostMapping("train")
	ResponseEntity<Train> addTrain(@RequestBody Train train)
	{
		ts.saveTrain(train);
		return new ResponseEntity("new Trains are added",HttpStatus.CREATED);
		
	}
	
	
	
	@GetMapping("train/{Id}")
	ResponseEntity<Train> getTrain(@PathVariable int Id)
	{
	//public Train getTrain(@PathVariable int Id)
	//{
		Train t= ts.getTrain(Id);
	//	return t;
		
		return new ResponseEntity(t,HttpStatus.OK);
	}
	
	@DeleteMapping("train/{Id}")
	public ResponseEntity<Train> deleteTrain(@PathVariable int Id)
	{
	//public int deleteTrain(@PathVariable int Id)
	//{
		ts.DeleteTrain(Id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("trains")
	public ResponseEntity<List<Train>> getAllTrain(){
//	public List<Train> getAllTrains()
	
		List<Train> train= ts.getAllTrain();
		//return train;
		
		if(train==null || train.isEmpty())
		{
			return new ResponseEntity("0 trains are available ",HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity(train,HttpStatus.OK);
	}
	
}

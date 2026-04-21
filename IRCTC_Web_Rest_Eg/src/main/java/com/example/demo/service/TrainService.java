package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Train;

public interface TrainService {

	public String saveTrain(Train train);
	public Train getTrain(int Id);
	public Train DeleteTrain(int Id);
	
	public List<Train> getAllTrain();
	
}

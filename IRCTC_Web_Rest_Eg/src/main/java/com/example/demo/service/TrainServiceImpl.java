package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Train;
import com.example.demo.repo.TrainRepo;

@Service
public class TrainServiceImpl implements TrainService {

	
	@Autowired
	TrainRepo repo;
	
	@Override
	public String saveTrain(Train train) {
		// TODO Auto-generated method stub
		repo.save(train);
		
		return "data saved";
	}

	@Override
	public Train getTrain(int Id) {
		// TODO Auto-generated method stub
	return	repo.findById(Id).orElse(null);
		//return t;
	}

	@Override
	public Train DeleteTrain(int Id) {
		// TODO Auto-generated method stub
	Train t= repo.findById(Id).orElse(null);
		if(t!=null) {
		repo.deleteById(Id);
		}
		
		return t;
	}

	@Override
	public List<Train> getAllTrain() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}

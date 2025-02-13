package com.placementManagementSystem.Placement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service			//must
@Transactional		//optional
public class PlacementService {
	
	//create objects to call the CRUD operations from repository.
	
	@Autowired
	private PlacementRepository repo;
	
	//create method to get all the records from the table.
	public List<Placement> listAll(){
		return repo.findAll();
	}
	
	//save record
	public void save(Placement placementserviceobj) {
		repo.save(placementserviceobj);
	}
	
	// retrieving specific record with id
	public Placement get(Integer id) {
		return repo.findById(id).get();
	}
	
	//Deleting specific record
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	//updating the existing record
	public void update(Placement placementserviceobj) {
		repo.save(placementserviceobj);
	}	
	
}

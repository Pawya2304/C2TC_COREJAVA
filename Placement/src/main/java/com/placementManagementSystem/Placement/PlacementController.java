package com.placementManagementSystem.Placement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class PlacementController {
	
	@Autowired
	private PlacementService placementserviceobj;			//create the object of other class (placementservice)
	
	@GetMapping("/placementservice")
	public List<Placement> list(){
		return placementserviceobj.listAll();
	}
	
	@PostMapping("/placementservice")
	public void add(@RequestBody Placement placementserviceobj1) {
		placementserviceobj.save(placementserviceobj1);
	}
	
	@GetMapping("/placementservice/{id}")
	public ResponseEntity<Placement> get(@PathVariable Integer id){
		try {
			Placement p = placementserviceobj.get(id);
			return new ResponseEntity<Placement>(p,HttpStatus.OK);
		}
		catch(NoResultException e) {
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@DeleteMapping("/placementservice/{id}")
	public void delete(@PathVariable Integer id) {
		placementserviceobj.delete(id);
	}
 
	
	@PutMapping("/placementservice/{id}")
	public ResponseEntity<Placement> update(@PathVariable Integer id, @RequestBody Placement update_p){
		try {
			Placement exist_p = placementserviceobj.get(id);
			exist_p.setCompanyName(update_p.getCompanyName());
			exist_p.setPosition(update_p.getPosition());
			exist_p.setLocation(update_p.getLocation());
			exist_p.setSalaryPackage(update_p.getSalaryPackage());
			exist_p.setDriveDate(update_p.getDriveDate());
			placementserviceobj.update(exist_p);
			return new ResponseEntity<Placement>(exist_p,HttpStatus.OK);
		}
		catch(NoResultException e) {
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}
		
}

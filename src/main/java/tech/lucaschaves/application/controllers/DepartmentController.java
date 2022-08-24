package tech.lucaschaves.application.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import tech.lucaschaves.application.entities.Department;
import tech.lucaschaves.application.services.DepartmentService;

@RestController
@RequestMapping("/api/department")
@CrossOrigin("*")
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@GetMapping
	public ResponseEntity<List<Department>> findAll(){
		List<Department> response = service.findAll();
		
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> findById(@PathVariable Long id){
		Department response = service.findById(id);
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<Department> save(@RequestBody Department obj){
		obj = service.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping
	public ResponseEntity<Department> update(@RequestBody Department obj) throws Exception{
		return new ResponseEntity<Department>(service.update(obj), HttpStatus.OK);
	}
}

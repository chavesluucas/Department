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

import tech.lucaschaves.application.entities.Collaborator;
import tech.lucaschaves.application.services.CollaboratorService;

@RestController
@RequestMapping(value = "/api/collaborators")
@CrossOrigin
public class CollaboratorController {

	@Autowired
	CollaboratorService service;
	
	@GetMapping
	public ResponseEntity<List<Collaborator>> findAll(){
		List<Collaborator> response = service.findAll();
		
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Collaborator> findById(@PathVariable Long id) {	
		Collaborator response = service.findById(id);
		
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<Collaborator> save(@RequestBody Collaborator collaborator) {
		collaborator = service.save(collaborator);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id")
				.buildAndExpand(collaborator.getId()).toUri();
		return ResponseEntity.created(uri).body(collaborator);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping
	public ResponseEntity<Collaborator> update(@RequestBody Collaborator collaborator) throws Exception{
		return new ResponseEntity<Collaborator>(service.update(collaborator), HttpStatus.OK);
	}
	
	
}

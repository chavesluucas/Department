package tech.lucaschaves.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import tech.lucaschaves.application.entities.Collaborator;
import tech.lucaschaves.application.repositories.CollaboratorRepository;

@Service
public class CollaboratorService {

	@Autowired
	CollaboratorRepository repository;
	
	public List<Collaborator> findAll(){
		List<Collaborator> response = repository.findAll();
		
		return response;
	}
	
	public Collaborator findById(Long id) {
		Optional<Collaborator> response = repository.findById(id);
		
		return response.get();
	}
	
	public Collaborator save(Collaborator obj) {
		return repository.save(obj);
	}
	
	//delete
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new RuntimeException(e.getMessage());
		} catch (DataIntegrityViolationException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public Collaborator update(Collaborator obj) {
		findById(obj.getId());
		
		return save(obj);
	}
	
}

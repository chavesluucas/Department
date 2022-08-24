package tech.lucaschaves.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import tech.lucaschaves.application.entities.Department;
import tech.lucaschaves.application.repositories.DepartamentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartamentRepository repository;

	public List<Department> findAll(){
		List<Department> response = repository.findAll();
		
		return response;
	}
	
	public Department findById(Long id) {
		Department response = repository.findById(id).get();
		
		return response;
	}
	
	public Department save(Department obj) {
		Department response = repository.save(obj);
		
		return response;
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch(EmptyResultDataAccessException e) {
			throw new RuntimeException(e.getMessage());
		} catch(DataIntegrityViolationException e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	
	public Department update(Department obj) {
		findById(obj.getId());
		return save(obj);
	}
}

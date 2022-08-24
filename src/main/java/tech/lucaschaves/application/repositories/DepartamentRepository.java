package tech.lucaschaves.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.lucaschaves.application.entities.Department;

public interface DepartamentRepository extends JpaRepository<Department, Long>{

}

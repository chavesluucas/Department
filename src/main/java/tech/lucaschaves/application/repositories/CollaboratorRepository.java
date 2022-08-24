package tech.lucaschaves.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.lucaschaves.application.entities.Collaborator;

public interface CollaboratorRepository extends JpaRepository<Collaborator, Long>{

}

package br.com.vanderson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vanderson.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
}

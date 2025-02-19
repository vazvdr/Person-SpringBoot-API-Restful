package br.com.vanderson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vanderson.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}
package br.com.rlourenco1998.repository;

import br.com.rlourenco1998.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
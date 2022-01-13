package com.springjpa.demo.Repository;

import com.springjpa.demo.Model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}

package com.springjpa.demo.Repository;

import com.springjpa.demo.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

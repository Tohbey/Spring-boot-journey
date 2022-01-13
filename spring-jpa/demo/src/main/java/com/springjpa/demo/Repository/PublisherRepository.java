package com.springjpa.demo.Repository;

import com.springjpa.demo.Model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

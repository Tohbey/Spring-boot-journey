package com.example.petclinic.repository;

import com.example.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}

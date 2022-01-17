package com.example.petclinic.service.map;

import com.example.petclinic.model.Speciality;
import com.example.petclinic.service.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/31/18.
 */
@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

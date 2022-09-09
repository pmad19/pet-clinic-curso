package tutorial.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import tutorial.sfgpetclinic.model.Speciality;
import tutorial.sfgpetclinic.services.SpecialityService;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findByID(Long id) {
        return super.findById(id);
    }
}

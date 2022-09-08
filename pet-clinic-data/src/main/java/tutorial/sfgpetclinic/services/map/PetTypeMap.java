package tutorial.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import tutorial.sfgpetclinic.model.PetType;
import tutorial.sfgpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findByID(Long id) {
        return super.findById(id);
    }
}

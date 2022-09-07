package tutorial.sfgpetclinic.model.services;

import tutorial.sfgpetclinic.model.Owner;

public interface OwnerService extends  CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}

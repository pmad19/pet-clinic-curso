package tutorial.sfgpetclinic.bootstrap;

import net.bytebuddy.asm.Advice;
import tutorial.sfgpetclinic.model.Owner;
import tutorial.sfgpetclinic.model.Pet;
import tutorial.sfgpetclinic.model.PetType;
import tutorial.sfgpetclinic.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tutorial.sfgpetclinic.services.OwnerService;
import tutorial.sfgpetclinic.services.PetTypeService;
import tutorial.sfgpetclinic.services.VetService;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAdress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("12345678");

        Pet mikesPet = new Pet();
        mikesPet.setName("Pluto");
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setOwner(owner1);
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner1.setAdress("123 Frontview");
        owner1.setCity("Los Santos");
        owner1.setTelephone("342342123");

        Pet fionaCat = new Pet();
        fionaCat.setName("Misifu");
        fionaCat.setPetType(savedCatPetType);
        fionaCat.setOwner(owner2);
        fionaCat.setBirthDate(LocalDate.now());
        owner2.getPets().add(fionaCat);

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets ...");


    }
}

import fasttrack.ro.Person;
import fasttrack.ro.PersonService;

import java.util.ArrayList;
import java.util.List;

public class MainService {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Nimrod", "Kovacs", 21, "Targu Mures"));
        persons.add(new Person("Tamas", "Temesvari", 75, "Cluj"));
        persons.add(new Person("Akos", "Kovacs", 16, "Oradea"));
        persons.add(new Person("Kristof", "Simonfi", 14, "ORAdea"));
        persons.add(new Person("Sandor", "Gall", 52, "CLUj"));
        persons.add(new Person("Gyuri", "Tunyogi", 32, "Bucuresti"));
        persons.add(new Person("Gyuri", "Tunyogi", 32, "Bucuresti"));
        persons.add(new Person("Gyuri", "Tunyogi", 32, "Bucuresti"));



        PersonService personService = new PersonService(persons);
        System.out.println(personService.allNames());
        System.out.println("====================================");
        personService.areMajor().forEach(System.out::println);
        System.out.println("====================================");
        personService.fromOradea().forEach(System.out::println);
        System.out.println("====================================");
        for (Person person : personService.fromOradeaOrCluj()) {
            System.out.println(person);
        }
        System.out.println("===================================");
        personService.allNamesCapitalized().forEach(System.out::println);
        System.out.println("====================================");
        personService.firstNameWithLastNameInitial().forEach(System.out::println);
        System.out.println("====================================");
        personService.agesBetween().forEach(System.out::println);
        System.out.println("====================================");
        personService.namesWithA().forEach(System.out::println);
        System.out.println("====================================");
        personService.unique().forEach(System.out::println);
        System.out.println("====================================");
        personService.sortByFirstName().forEach(System.out::println);

        System.out.println("====================================");
        personService.sortByLastName().forEach(System.out::println);

        System.out.println("====================================");
        personService.sortByFirstLastNameAge().forEach(System.out::println);






    }
}

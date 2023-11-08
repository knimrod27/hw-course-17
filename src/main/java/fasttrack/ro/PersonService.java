package fasttrack.ro;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    private final List<Person> people;

    public PersonService(List<Person> people) {
        this.people = people;
    }


    public List<String> allNames() {
        return people.stream().map(person -> person.getFirstName() +" " + person.getLastName()).collect(Collectors.toList());

    }

    public List<Person> areMajor() {
        return people.stream().filter(person -> person.getAge() >=18).collect(Collectors.toList());

    }
    public List<Person> fromOradea() {
        return people.stream().
                filter(person -> person.getCity().equalsIgnoreCase("Oradea")).collect(Collectors.toList());
    }
    public List<Person> fromOradeaOrCluj() {
        return people.stream().
                filter(person -> person.getCity().
                        equalsIgnoreCase("Oradea") || person.getCity().equalsIgnoreCase("Cluj"))
                .collect(Collectors.toList());
    }

    public List<String> allNamesCapitalized() {
        return people.stream().map(person -> person.getFirstName().toUpperCase()).collect(Collectors.toList());
    }
    public List<String> firstNameWithLastNameInitial() {
        return people.stream().map(person -> person.getFirstName() + " " + person.getLastName().charAt(0) + ".").collect(Collectors.toList());
    }

    public List<Person> agesBetween() {
        return people.stream().filter(person -> person.getAge() > 18 && person.getAge() < 60).collect(Collectors.toList());

    }
    public  List<Person> namesWithA() {
        return people.stream().filter(person -> person.getFirstName().startsWith("A")).collect(Collectors.toList());
    }
    public List<String> unique() {
        return people.stream().map(person -> person.getFirstName()).distinct().collect(Collectors.toList());

    }

    public List<Person> sortByFirstName() {
        return people.stream().sorted(Comparator.comparing(Person:: getFirstName)).collect(Collectors.toList());
    }
    public List<Person> sortByLastName() {
        return people.stream().sorted(Comparator.comparing(Person:: getLastName)).collect(Collectors.toList());
    }

    public List<Person> sortByFirstLastNameAge() {
        return people.stream().sorted(Comparator.comparing(Person:: getFirstName).thenComparing(Person::getLastName).thenComparing(Person::getAge)).collect(Collectors.toList());
    }

}

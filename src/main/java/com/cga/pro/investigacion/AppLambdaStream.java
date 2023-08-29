package com.cga.pro.investigacion;

import com.cga.pro.investigacion.lambda_stream.model.Person;
import com.cga.pro.investigacion.lambda_stream.model.Product;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class AppLambdaStream {

    public static int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static void printList(List<?> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {

        Person p1 = new Person(1, "Mito", LocalDate.of(1991, 1, 21));
        Person p2 = new Person(2, "Code", LocalDate.of(1990, 2, 21));
        Person p3 = new Person(3, "Jaime", LocalDate.of(1980, 6, 23));
        Person p4 = new Person(4, "Duke", LocalDate.of(2019, 5, 15));
        Person p5 = new Person(5, "James", LocalDate.of(2010, 1, 4));

        Product pr1 = new Product(1, "Ceviche", 15.0);
        Product pr2 = new Product(2, "Chilaquiles", 25.50);
        Product pr3 = new Product(3, "Bandeja Paisa", 35.50);
        Product pr4 = new Product(4, "Ceviche", 15.0);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
        List<Product> products = Arrays.asList(pr1, pr2, pr3, pr4);

        // Lambdas // Method Reference
//        for (int i = 0; i < persons.size(); i++) {
//            System.out.println(persons.get(i));
//        }
//        for (Person p : persons) System.out.println(p);
//        persons.forEach(p -> System.out.println(p));
        persons.forEach(System.out::println);
        System.out.println();

        // Filter (param: Predicate)
        List<Person> filteredList1 = persons.stream()
                .filter(p -> AppLambdaStream.getAge(p.getBirthDate()) > 18)
                .toList();
        AppLambdaStream.printList(filteredList1);
        System.out.println();

        // Map (param: Function)
        List<Integer> agesList = persons.stream()
                .filter(p -> AppLambdaStream.getAge(p.getBirthDate()) > 18)
                .map(p -> AppLambdaStream.getAge(p.getBirthDate()))
                .toList();
        AppLambdaStream.printList(agesList);
        System.out.println();
        Function<String, String> coderFunction = name -> "Coder: " + name.toUpperCase(Locale.ROOT);
        List<String> namesList = persons.stream()
                //.map(p -> "Coder: " + p.getName().toUpperCase(Locale.ROOT))
                .map(Person::getName)
                .map(coderFunction)
                .toList();
        AppLambdaStream.printList(namesList);
        System.out.println();

        // Sorted (param: Comparator)
        //Comparator<Person> byNameAsc = Comparator.comparing(Person::getName);
        Comparator<Person> byNameAsc = (Person a, Person b) -> a.getName().compareTo(b.getName());
        Comparator<Person> byNameDes = (Person a, Person b) -> b.getName().compareTo(a.getName());
        Comparator<Person> byBirthDate = (Person a, Person b) -> a.getBirthDate().compareTo(b.getBirthDate());
        List<Person> orderedByNameAsc = persons.stream()
                .sorted(byNameAsc)
                .toList();
        AppLambdaStream.printList(orderedByNameAsc);
        System.out.println();
        List<Person> orderedByNameDes = persons.stream()
                .sorted(byNameDes)
                .toList();
        AppLambdaStream.printList(orderedByNameDes);
        System.out.println();
        List<Person> orderedByBirthDate = persons.stream()
                .sorted(byBirthDate)
                .toList();
        AppLambdaStream.printList(orderedByBirthDate);
        System.out.println();

        // Match (param: Predicate)
    }
}

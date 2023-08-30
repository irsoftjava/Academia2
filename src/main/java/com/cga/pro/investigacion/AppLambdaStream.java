package com.cga.pro.investigacion;

import com.cga.pro.investigacion.lambda_stream.model.Person;
import com.cga.pro.investigacion.lambda_stream.model.Product;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
        Product pr3 = new Product(3, "Bandeja Pisa", 35.50);
        Product pr4 = new Product(4, "Ceviche", 15.0);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
        List<Product> products = Arrays.asList(pr1, pr2, pr3, pr4);

        // Lambdas / Method Reference
        // for (Person p : persons) System.out.println(p);
        // persons.forEach(p -> System.out.println(p));
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
        // Comparator<Person> byNameAsc = Comparator.comparing(Person::getName);
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
        Predicate<Person> startWithPredicate = person -> person.getName().startsWith("J");
        // anyMatch: No evalúa todo el stream, termina en la coincidencia. Devuelve un boolean.
        boolean resp1 = persons.stream()
                .anyMatch(startWithPredicate);
        System.out.println(resp1);
        System.out.println();

        // allMatch: Evalúa todo el stream bajo la condición. Todos deben coincidir para que sea true.
        boolean resp2 = persons.stream()
                .allMatch(startWithPredicate);
        System.out.println(resp2);
        System.out.println();

        // noneMatch: Evalúa todo el stream bajo la condición. Ninguno debe coincidir con la "J" para que sea true.
        boolean resp3 = persons.stream()
                .noneMatch(startWithPredicate);
        System.out.println(resp3);
        System.out.println();

        // Limit / Skip
        List<Person> list4 = persons.stream()
                .skip(2)    // Salta los dos primeros
                .collect(Collectors.toList());
        AppLambdaStream.printList(list4);
        System.out.println();
        List<Person> list5 = persons.stream()
                .limit(2)    // Se limita a dos primeros
                .collect(Collectors.toList());
        AppLambdaStream.printList(list5);
        System.out.println();

        // Collectors
        // GroupBy
        Map<Double, List<Product>> collect1 = products.stream()
                .filter(p -> p.getPrice() > 20)
                .collect(Collectors.groupingBy(Product::getPrice));
        System.out.println(collect1);

        // Counting
        Map<String, Long> collect2 = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getName, Collectors.counting()
                ));
        System.out.println(collect2);
        System.out.println();

        // Agrupando por nombre producto y sumando
        Map<String, Double> collect3 = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getName, Collectors.summingDouble(Product::getPrice)
                ));
        System.out.println(collect3);

        // Obteniendo suma y resumen
        DoubleSummaryStatistics statistics = products.stream()
                .collect(Collectors.summarizingDouble(Product::getPrice));
        System.out.println(statistics);
        System.out.println(statistics.getSum());
        System.out.println();

        // Reduce
        Optional<Double> sum = products.stream()
                .map(Product::getPrice)
                //.reduce((a, b) -> a + b)
                .reduce(Double::sum);
        System.out.println(sum.get());
        System.out.println();
    }
}

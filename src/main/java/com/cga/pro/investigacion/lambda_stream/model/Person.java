package com.cga.pro.investigacion.lambda_stream.model;

import java.time.LocalDate;

public class Person {

    private final Integer id;
    private final String name;
    private final LocalDate birthDate;

    public Person(Integer id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ')';
    }
}

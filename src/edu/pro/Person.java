package edu.pro;
/*
  @author   george
  @project   google-style
  @class  Person
  @version  1.0.0 
  @since 24.01.23 - 17.42
*/

import java.io.Serial;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private LocalDate dateOfBirth;
     @Serial @Deprecated private boolean isAdult;

    public Person() {
    }

    public Person(String firstName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

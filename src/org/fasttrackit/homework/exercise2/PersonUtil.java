package org.fasttrackit.homework.exercise2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonUtil {
    private Person person;

    public PersonUtil(Person person) {
        this.person = person;
    }

    public String getFullName() {
        String fullName1 = person.getFirstName() + " " + person.getLastName();
        String fullName2 = String.format("%s %s", person.getFirstName(), person.getLastName());
        String fullName3 = new StringBuilder().append(person.getFirstName()).append(" ").append(person.getLastName()).toString();
        return fullName1;
    }

    public int getAge() {
        LocalDate birthdate = person.getBirthDate();
        LocalDate now = LocalDate.now();
        boolean hasPassed = now.getMonthValue() > birthdate.getMonthValue() || (now.getMonthValue() == birthdate.getMonthValue() && now.getDayOfMonth() > birthdate.getDayOfMonth());
        boolean hasPassed2 = now.getDayOfYear() > birthdate.getDayOfYear();
        return now.getYear() - birthdate.getYear() - (hasPassed2 ? 0 : 1);
    }

    public int getAge2() {
        return (int) ChronoUnit.YEARS.between(person.getBirthDate(), LocalDate.now());
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBirthdate(LocalDate.of(2003, 2, 10));

        PersonUtil personUtil = new PersonUtil(employee);

        System.out.println(personUtil.getAge2());

        Object obj = new Employee();
        if(obj instanceof  Employee){
            System.out.println("is Employee");
        }
    }
}
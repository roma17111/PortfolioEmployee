package org.example;


import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@NonNull
public class Employee {
    private static int count =1;

    private final int id;
    private final String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        this.id = count++;
        this.fullName = fullName;
        if (department < 0 || department > 5) {
            throw new IllegalArgumentException();
        } else {
            this.department = department;
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  id+". ФИО " + fullName + '\n' +
                "Отдел: " + department +'\n' +
                "Зарплата: " + salary+ " руб." +'\n';
    }
}

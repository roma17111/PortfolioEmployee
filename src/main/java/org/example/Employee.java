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
    private Department department;
    private int salary;

    public Employee(String fullName, Department department, int salary) {
        this.id = count++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  id+". ФИО " + fullName + '\n' +
                "Отдел: " + department.getNumberOfDepartment() +'\n' +
                "Зарплата: " + salary+ " руб." +'\n';
    }
}

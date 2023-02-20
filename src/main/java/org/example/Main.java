package org.example;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee("Якименко Роман Эдуардович",
                1,
                200000));
        employeeBook.addEmployee(new Employee("Якименко Вероника Владимировна",
                2,
                150000));
        employeeBook.addEmployee(new Employee("Васин иван иванович",
                3,
                120000));
        employeeBook.addEmployee(new Employee("Алёшина Наталья Михайловна",
                4,
                80000));
        employeeBook.addEmployee(new Employee("Иванова Марина борисовна",
                5,
                95000));
        employeeBook.addEmployee(new Employee("Андреев Сергей Викторович",
                1,
                175000));
        employeeBook.addEmployee(new Employee("Изотова Римма Андреевна",
                2,
                65000));
        employeeBook.addEmployee(new Employee("Костин Сергей Витальевич",
                3,
                98000));
        employeeBook.addEmployee( new Employee("Катина Ирина Яковлевна",
                4,
                42000));
        employeeBook.addEmployee(new Employee("Яковенко Владлена Игоревна",
                5,
                52000));
        employeeBook.changeEmployeeByFio("Якименко Роман Эдуардович", 1000200, 5);
        employeeBook.printAllEmployees();
        employeeBook.getSumAllSallaryes();
        employeeBook.printAllEmployeesBYDepartments();
    }
}
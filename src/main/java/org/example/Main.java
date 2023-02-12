package org.example;

import java.util.Arrays;

public class Main {
   private static Employee[] employees = new Employee[10];

    public static void printAllEmployees() {
        Arrays.stream(employees).forEach(System.out::println);
    }

    public static void main(String[] args) {

        employees[0] = new Employee("Якименко Роман Эдуардович",
                Department.DEPARTMENT1,
                20000);
        employees[1] = new Employee("Якименко Вероника Владимировна",
                Department.DEPARTMENT1,
                100000);
        employees[2] = new Employee("Васин иван иванович",
                Department.DEPARTMENT3,
                120000);
        employees[3] = new Employee("Алёшина Наталья Михайловна",
                Department.DEPARTMENT4,
                80000);
        employees[4] = new Employee("Иванова Марина борисовна",
                Department.DEPARTMENT5,
                95000);
        employees[5] = new Employee("Андреев Сергей Викторович",
                Department.DEPARTMENT1,
                175000);
        employees[6] = new Employee("Изотова Римма Андреевна",
                Department.DEPARTMENT2,
                65000);
        employees[7] = new Employee("Костин Сергей Витальевич",
                Department.DEPARTMENT3,
                98000);
        employees[8] = new Employee("Катина Ирина Яковлевна",
                Department.DEPARTMENT4,
                42000);
        employees[9] = new Employee("Яковенко Владлена Игоревна",
                Department.DEPARTMENT5,
                52000);
        printAllEmployees();
    }
}
package org.example;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Main {
   private static Employee[] employees = new Employee[10];

    public static void getAverageSallary() {
        int avg = Arrays.stream(employees)
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Средняя зарплата сотрудников: " + avg/ employees.length);
    }

    public static void getMinSallary() {
        String s = null;
        int min = Arrays.stream(employees).mapToInt(Employee::getSalary).min()
                .getAsInt();
        for (Employee employee : employees) {
            if (min == employee.getSalary()) {
                s = employee.getFullName() + " " + employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника " + s);
        }

    public static void getMaxSallary() {
        String s = null;
        int max = Arrays.stream(employees).mapToInt(Employee::getSalary).max()
                .getAsInt();
        for (Employee employee : employees) {
            if (max == employee.getSalary()) {
                s = employee.getFullName() + " " + employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника " + s);
    }

   public static void getSumAllSallaryes() {
      int sum = Arrays.stream(employees)
               .mapToInt(Employee::getSalary)
               .sum();
       System.out.println("Сумма затрат на зарплату " +sum+ " руб.");
   }


    public static void printAllEmployees() {
        Arrays.stream(employees).forEach(System.out::println);
    }

    public static void main(String[] args) {

        employees[0] = new Employee("Якименко Роман Эдуардович",
                Department.DEPARTMENT1,
                200000);
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
        getSumAllSallaryes();
        getMinSallary();
        getMaxSallary();
        getAverageSallary();

    }
}
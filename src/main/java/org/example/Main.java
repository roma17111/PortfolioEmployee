package org.example;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Main {
   private static Employee[] employees = new Employee[10];

    public static void findEmployeeByDepartment(int department) {
        String s = null;
        int min = Arrays.stream(employees)
                .filter(employee -> employee.getDepartment() == department)
                .mapToInt(Employee::getSalary   ).min().getAsInt();
        for (Employee employee : employees) {
            if (employee.getSalary()== min && employee.getDepartment()== department)
                s = employee.getFullName();
        }
        System.out.println("Минимальная зарплата по отделу "+ department + ": " + min);
        System.out.println("ФИО сотрудника: " +s);
    }

    public static void getIndexSallary(int percent) {
        Arrays.stream(employees)
                .forEach(employee -> employee
                        .setSalary((employee.getSalary() / 100 * percent)+ employee.getSalary()));
    }

    public static void getEmployess() {
        System.out.println();
        System.out.println("Список всех сотрудников: ");
        Arrays.stream(employees).map(Employee::getFullName).forEach(System.out::println);
    }


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
                1,
                200000);
        employees[1] = new Employee("Якименко Вероника Владимировна",
                1,
                150000);
        employees[2] = new Employee("Васин иван иванович",
                3,
                120000);
        employees[3] = new Employee("Алёшина Наталья Михайловна",
                4,
                80000);
        employees[4] = new Employee("Иванова Марина борисовна",
                5,
                95000);
        employees[5] = new Employee("Андреев Сергей Викторович",
                1,
                175000);
        employees[6] = new Employee("Изотова Римма Андреевна",
                2,
                65000);
        employees[7] = new Employee("Костин Сергей Витальевич",
                3,
                98000);
        employees[8] = new Employee("Катина Ирина Яковлевна",
                4,
                42000);
        employees[9] = new Employee("Яковенко Владлена Игоревна",
                5,
                52000);
        printAllEmployees();
        getSumAllSallaryes();
        getMinSallary();
        getMaxSallary();
        getAverageSallary();
        getEmployess();
        getIndexSallary(10);
        printAllEmployees();
        findEmployeeByDepartment(1);

    }
}
package org.example;

import java.util.*;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void findHighSallary(int n) {
        System.out.println();
        System.out.println("Сотрудники с зарплатой больше или равно " + n);
        Arrays.stream(employees)
                .filter(employee -> employee.getSalary() >= n)
                .forEach(System.out::println);
    }

    public static void findLowSallary(int n) {
        System.out.println();
        System.out.println("Сотрудники с зарплатой меньше " + n);
        Arrays.stream(employees)
                .filter(employee -> employee.getSalary() < n)
                .forEach(System.out::println);
    }

    public static void printEmployeeByDepartment(int d) {
        System.out.println("Сотрудники департамента " + d + ":");
        Arrays.stream(employees)
                .filter(employee -> employee.getDepartment() == d)
                .map(employee -> employee.getFullName() + employee.getSalary())
                .forEach(System.out::println);

    }

    public static void indexSallaryByDep(int dep, int percent) {
        Arrays.stream(employees)
                .filter(employee -> employee.getDepartment() == dep)
                .forEach(employee -> employee.setSalary(employee.getSalary() / 100 * percent +
                        employee.getSalary()));
    }

    public static void getAvgByDepartmant(int departmant) {
        double avg = (int) Arrays.stream(employees)
                .filter(employee -> employee.getDepartment() == departmant)
                .mapToInt(Employee::getSalary)
                .average().getAsDouble();
        System.out.println("Средняя зарплата по отделу " + departmant + ": " + avg);
    }

    public static void getSumSalaryFromDepartment(int department) {
        int sum = Arrays.stream(employees).filter(employee -> employee.getDepartment() == department)
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Сумма зарплат по отделу " + department + ": " + sum);
    }

    public static void findMinEmployeeByDepartment(int department) {
        Employee employee = Arrays.stream(employees)
                .filter(employee1 -> employee1.getDepartment()==department)
                .min(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println("Минимальная зарплата по отделу " + department + ": " + employee.getSalary());
        System.out.println("ФИО сотрудника: " + employee.getFullName());
    }

    public static void findMaxEmployeeByDepartment(int department) {
        Employee employee = Arrays.stream(employees)
                .filter(employee1 -> employee1.getDepartment()==department)
                .max(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println("Максимальная зарплата по отделу " + department + ": " + employee.getSalary());
        System.out.println("ФИО сотрудника: " + employee.getFullName());
    }

    public static void getIndexSallary(int percent) {
        Arrays.stream(employees)
                .forEach(employee -> employee
                        .setSalary((employee.getSalary() / 100 * percent) + employee.getSalary()));
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
        System.out.println("Средняя зарплата сотрудников: " + avg / employees.length);
    }

    public static void getMinSallary() {
        System.out.println();
        Employee employee = Arrays.stream(employees)
                .min(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println("Минимальная зарплата сотрудника " + employee);
    }

    public static void getMaxSallary() {
        System.out.println();
        Employee employee = Arrays.stream(employees)
                .max(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println("Максимальная зарплата сотрудника " + employee);
    }

    public static void getSumAllSallaryes() {
        int sum = Arrays.stream(employees)
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Сумма затрат на зарплату " + sum + " руб.");
    }


    public static void printAllEmployees() {
        Arrays.stream(employees).forEach(System.out::println);
    }

    public static void main(String[] args) {

        employees[0] = new Employee("Якименко Роман Эдуардович",
                1,
                200000);
        employees[1] = new Employee("Якименко Вероника Владимировна",
                2,
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
        findMinEmployeeByDepartment(1);
        findMaxEmployeeByDepartment(4);
        getSumSalaryFromDepartment(3);
        getAvgByDepartmant(5);
        indexSallaryByDep(2, 20);
        printAllEmployees();
        printEmployeeByDepartment(3);
        findLowSallary(100000);
        findHighSallary(100000);

    }
}
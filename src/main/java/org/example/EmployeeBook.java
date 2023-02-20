package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeBook {

    private List<Employee> employees = new ArrayList<>();

    public void printAllEmployeesBYDepartments() {
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment)));
    }

    public Employee changeEmployeeByFio(String fio, int salary, int department) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fio))
                employee.setDepartment(department);
            employee.setSalary(salary);
        }
        return new Employee(fio,department,salary);
    }

    public void deleteEmployeeById(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printAllEmployees() {
        employees.forEach(System.out::println);
    }

    public void getSumAllSallaryes() {
        int sum = employees
                .stream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Сумма затрат на зарплату " + sum + " руб.");
    }

    public void getMaxSallary() {
        System.out.println();
        Employee employee = employees
                .stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println("Максимальная зарплата сотрудника " + employee);
    }


    public void getMinSallary() {
        System.out.println();
        Employee employee = employees
                .stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println("Минимальная зарплата сотрудника " + employee);
    }

    public void getAverageSallary() {
        int avg = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Средняя зарплата сотрудников: " + avg / employees.size());
    }


    public void getEmployess() {
        System.out.println();
        System.out.println("Список всех сотрудников: ");
        employees.stream().map(Employee::getFullName).forEach(System.out::println);
    }

    public void getIndexSallary(int percent) {
        employees.stream()
                .forEach(employee -> employee
                        .setSalary((employee.getSalary() / 100 * percent) + employee.getSalary()));
    }


    public void findMaxEmployeeByDepartment(int department) {
        Employee employee = employees
                .stream()
                .filter(employee1 -> employee1.getDepartment() == department)
                .max(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println("Максимальная зарплата по отделу " + department + ": " + employee.getSalary());
        System.out.println("ФИО сотрудника: " + employee.getFullName());
    }

    public void findMinEmployeeByDepartment(int department) {
        Employee employee = employees
                .stream()
                .filter(employee1 -> employee1.getDepartment() == department)
                .min(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println("Минимальная зарплата по отделу " + department + ": " + employee.getSalary());
        System.out.println("ФИО сотрудника: " + employee.getFullName());
    }

    public void getSumSalaryFromDepartment(int department) {
        int sum = employees.stream().filter(employee -> employee.getDepartment() == department)
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println("Сумма зарплат по отделу " + department + ": " + sum);
    }


    public void getAvgByDepartmant(int departmant) {
        double avg = (int) employees
                .stream()
                .filter(employee -> employee.getDepartment() == departmant)
                .mapToInt(Employee::getSalary)
                .average().getAsDouble();
        System.out.println("Средняя зарплата по отделу " + departmant + ": " + avg);
    }


    public void indexSallaryByDep(int dep, int percent) {
        employees
                .stream()
                .filter(employee -> employee.getDepartment() == dep)
                .forEach(employee -> employee.setSalary(employee.getSalary() / 100 * percent +
                        employee.getSalary()));
    }


    public void printEmployeeByDepartment(int d) {
        System.out.println("Сотрудники департамента " + d + ":");
        employees
                .stream()
                .filter(employee -> employee.getDepartment() == d)
                .map(employee -> employee.getFullName() + employee.getSalary())
                .forEach(System.out::println);

    }


    public void findLowSallary(int n) {
        System.out.println();
        System.out.println("Сотрудники с зарплатой меньше " + n);
        employees
                .stream()
                .filter(employee -> employee.getSalary() < n)
                .forEach(System.out::println);
    }

    public void findHighSallary(int n) {
        System.out.println();
        System.out.println("Сотрудники с зарплатой больше или равно " + n);
        employees
                .stream()
                .filter(employee -> employee.getSalary() >= n)
                .forEach(System.out::println);
    }
}

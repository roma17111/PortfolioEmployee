package org.example.service;

import org.example.Employee;
import org.example.EmployeeBook;

import java.util.Scanner;

public class ScannerService {

    private static final EmployeeBook EMPLOYEE_BOOK = new EmployeeBook();

    public static void startMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                System.out.println("Выберите пункт меню: ");
                printMenu();
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            addEmployee();
                            break;
                        case 2:
                         dropEmployee(scanner);
                            break;
                        case 3:
                            EMPLOYEE_BOOK.printAllEmployees();
                            break;
                        case 4:
                            System.out.println("Введите номер отдела");
                            int b = scanner.nextInt();
                            EMPLOYEE_BOOK.printEmployeeByDepartment(b);
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println(
                """
                        1. Добавить Сотрудника
                        2. Уволить сотрудника
                        3. Получить список всех сотрудников
                        4. Получить список всех сотрудников по отделу
                        0. Выход
                        """
        );
    }

    private static void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО.");
        String fio = scanner.nextLine();
        System.out.println("Введите Номер отдела от 1 до 5");
        int numberOfDep = scanner.nextInt();
        System.out.println("Введите зарплату");
        int salary = scanner.nextInt();
        Employee employee = new Employee(fio, numberOfDep, salary);
        EMPLOYEE_BOOK.addEmployee(employee);
    }

    private static void dropEmployee(Scanner scanner) {
        System.out.println("Введите id сотрудника");
        int a = scanner.nextInt();
        EMPLOYEE_BOOK.deleteEmployeeById(a);
        System.out.println("Сотрудник с id " + a + " уволен!!!");
    }

}

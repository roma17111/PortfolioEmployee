package org.example;

import org.example.service.ScannerService;

import java.util.Scanner;

public class Main {

    private static final String PASSWORD = "12345";
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите пароль");
        String pass = s.nextLine();
        if (!pass.equals(PASSWORD)) {
            throw new UnsupportedOperationException("Отказано в доступе");
        }

        ScannerService.startMenu();
    }
}
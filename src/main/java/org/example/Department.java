package org.example;

public enum Department {

    DEPARTMENT1(1),
    DEPARTMENT2(2),
    DEPARTMENT3(3),
    DEPARTMENT4(4),
    DEPARTMENT5(5);


    private int numberOfDepartment;

    Department(int numberOfDepartment) {
        this.numberOfDepartment = numberOfDepartment;
    }

    public int getNumberOfDepartment() {
        return numberOfDepartment;
    }

    public void setNumberOfDepartment(int numberOfDepartment) {
        this.numberOfDepartment = numberOfDepartment;
    }
}

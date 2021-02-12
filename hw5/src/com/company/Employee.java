package com.company;

public class Employee {
    String fullname;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String fullname, String position, String email, String phone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    int getAge(){
        return age;
    }


    public void viewEmployee() {
        System.out.println("ФИО: " + fullname + "\nДолжность :" + position +
                "\nEmail: " + email + "\nТелефон " + phone + "\nЗП :" + salary + "\nВозраст" + age+"\n");
    }
}

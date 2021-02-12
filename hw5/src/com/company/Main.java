package com.company;

public class Main {

    public static void main(String[] args) {
	Employee[] co_worker = new Employee[5];
	co_worker[0] = new Employee("ФИО 1", "должность 1",
            "email@nsa.gov", "111", 1, 45);
	co_worker[1] = new Employee("ФИО 1", "должность 1",
                "email@nsa.gov", "111", 1, 44);
	co_worker[2] = new Employee("ФИО 1", "должность 1",
                "email@nsa.gov", "111", 1, 31);
	co_worker[3] = new Employee("ФИО 1", "должность 1",
                "email@nsa.gov", "111", 1, 21);
	co_worker[4] = new Employee("ФИО 1", "должность 1",
                "email@nsa.gov", "111", 1, 42);

        for (int i = 0; i < co_worker.length ; i++) {
            if(co_worker[i].getAge() > 40) co_worker[i].viewEmployee();
        }

//for (Employee employee : co_worker){
//    if(employee.getAge() > 40){
//        employee.viewEmployee();
//    }

        }
    }


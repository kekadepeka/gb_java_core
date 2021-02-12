package com.company;

public class HomeWork1 {

    public static void main(String[] args) {
        part3(2.0f, 1.0f, 3.0f, 4.0f);
        System.out.println(part4(1, 20));
        part5(0);
        part6(-1);
        part7("kekapupeka");
        part8(200);
    }

    static void part2() {
        //Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte a = 1;
        short b = 1337;
        int c = 3;
        long d = -9L;
        float e = 2.5f;
        double f = 12.1;
        char g = '1';
        boolean h = true;
    }

    static void part3(float a, float b, float c, float d) {
        //Написать метод вычисляющий выражение a * (b + (c / d))
        //и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float.
        float res = a * (b + (c / d));
        System.out.println(res);
    }

    static boolean part4(int first, int second) {
        //Написать метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        int sum = first + second;
        if (sum <= 20 && sum >= 10) {
            return true;
        } else return false;
    }

    static void part5(int number) {
        //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        if (number >= 0) {
            System.out.println("plus");
        } else System.out.println("minus");
    }

    static boolean part6(int number) {
        //Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        if (number < 0) {
            return true;
        } else return false;

    }

    static void part7(String name) {
        //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        System.out.println("Privet, " + name + "!");
    }

    static void part8(int year) {
        //Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
         if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))){
             System.out.println("не високосный");
         }else System.out.println("високосный");
    }
}
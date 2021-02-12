package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        game();
    }
//Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
//При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
//После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
       public static void game(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guessNumber = random.nextInt(9);
        System.out.println(guessNumber);
        int check = 3;
        do {
            System.out.println("Угадайте загаданное число с 3-х попыток ==> ");
                int userNumber = scanner.nextInt();
                if (userNumber == guessNumber){
                    System.out.println("Вы выиграли");
                    break;
            }if (userNumber > guessNumber){
                System.out.println("Больше");
                check = check - 1;
            }if (userNumber < guessNumber){
                System.out.println("Меньше");
                check = check - 1;
            }
        }while (check > 0);

        if (check == 0){
            System.out.println("Вы проиграли");
        }System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int nextTry = scanner.nextInt();
        if (nextTry == 1){
            game();
        }else System.out.println("До следующего раза!");

    }
}

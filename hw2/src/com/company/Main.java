package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonArray();
    }
    public static void invertArray() {
        //Задание1:
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Задание 1:");
        for (int i = 0; i < array1.length; i++){
            if (array1[i] == 1){
                array1[i] = 0;
            }else array1[i] = 1;
            //System.out.println(array1[i]);
        }System.out.println(Arrays.toString(array1));
    }

    public static void fillArray() {
        //Задание 2:
        //Задать пустой целочисленный массив размером 8.
        //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("Задание 2:");
        int[] array2 = new int[8];
        for (int i = 0, j = 0; i < array2.length; i++, j+=3){
            array2[i] = j;
        }System.out.println(Arrays.toString(array2));
    }

    public static void changeArray() {
        //Задание 3:
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        //пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Задание 3:");
        int[] array3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array3.length; i++){
            if (array3[i] < 6){
                array3[i] = array3[i]*2;
            }
        }System.out.println(Arrays.toString(array3));
    }

    public static void fillDiagonArray() {
        //Задание 4:
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] array4 = new int[3][3];
        for (int i = 0; i < array4.length; i++){
            for (int j =0; j <array4.length; j++){
                if (i == j | i+j == array4.length - 1){
                    array4[i][j] = 1;
                }
                System.out.print(array4[i][j]);
            }System.out.println();
        }
    }


}

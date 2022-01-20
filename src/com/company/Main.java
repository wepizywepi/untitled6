package com.company;

import java.lang.ref.SoftReference;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main (String []args){

   double [] nums= { -2, 4, -3, 12, -17, 25, -75, 11, -22, 35, -75, 45, -55, 80, -55};
        double result = 0;

    // Цикл for each
        for( double m : nums){
            result +=m;
        }
        System.out.println("Значение среднего арифметического числа равно :" + result / nums.length);

    }




    }





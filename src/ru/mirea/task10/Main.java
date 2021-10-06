package ru.mirea.task10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ex13();
        System.out.println();
        ex14(248505);
        System.out.println();
        ex15(887499);
        System.out.println();
        System.out.println(ex16()[1]);
        System.out.println(ex17());
    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a != 0){
            System.out.print(a + " ");
            a = sc.nextInt();
            if (a != 0)
                ex13();
        }

    }

    public static void ex14(int n){
        if (n == 0){
            return;
        }
        else {
            ex14(n/10);
            System.out.println(n%10);
        }
    }

    public static void ex15(int n){
        if (n == 0){
            return;
        }
        else {
            System.out.println(n%10);
            ex15(n/10);
        }
    }

    public static int[] ex16(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        if (a == 0) {
            int[] arr = {0, 0};
            return arr;
        }

        int[] b = ex16();
        if (a > b[0]){
            int[] arr = {a, 1};
            return arr;
        }
        else if (a == b[0]){
            int[] arr = {a, b[1] + 1};
            return arr;
        }
        else{
            int[] arr = {b[0], b[1]};
            return arr;
        }
    }

    public static int ex17(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 0)
            return a;

        int b = ex17();
        if (a > b)
            return a;
        else
            return b;
    }
}

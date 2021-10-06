package ru.mirea.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ex13();
        System.out.println();
        ex14(248505);
        System.out.println();
        ex15(887499);

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

    public static int ex16(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        if (a == 0)
            return a;

        int b = ex16();
        if (a > b)
            return 0;
        else if (a == b)
            return count + 1;
        else
            return 0;
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

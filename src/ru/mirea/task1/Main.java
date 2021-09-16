package ru.mirea.task1;

import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args)
    {
        ex1();

        //ex2
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }

        ex3();

        ex4();

        System.out.println();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ex5(a);
    }

    public static void ex1()
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumfor = 0;
        int sumwhile = 0;
        int sumdowhile = 0;

        for (int i = 0; i < 10; i++)
        {
            sumfor += arr[i];
        }

        int i = 0;
        while (i < 10)
        {
            sumwhile += arr[i];
            i++;
        }

        i = 0;
        do
        {
            sumdowhile += arr[i];
            i++;
        }while(i < 10);

        System.out.println(sumfor);
        System.out.println(sumwhile);
        System.out.println(sumdowhile);
    }

    public static void ex2()
    {

    }

    public static void ex3() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("1/" + i);
        }
    }

    public static void ex4() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 11);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void ex5(int x)
    {
        int fact = 1;
        for (int i = 1; i <= x; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
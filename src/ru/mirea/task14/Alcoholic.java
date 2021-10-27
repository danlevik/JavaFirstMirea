package ru.mirea.task14;

import java.util.*;

public class Alcoholic {
    public static void main(String[] args){
        int[] cards = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            cards[i] = sc.nextInt();

        ex1Stack(cards);
        ex2Queue(cards);
        ex3Dequeue(cards);
        ex4DoubleList(cards);
    }

    public static void ex1Stack(int[] cards){
        int turns = 0;

        Stack<Integer> first_hand = new Stack();
        Stack<Integer> second_hand = new Stack();


        for (int i = 4; i >= 0; i--)
            first_hand.push(cards[i]);

        for (int i = 9; i >= 5; i--)
            second_hand.push(cards[i]);

        System.out.println(first_hand);
        System.out.println(second_hand);

        while (!first_hand.empty() && !second_hand.empty()){
            if (turns >= 106){
                System.out.println("botwa");
                break;
            }

            int first_card = first_hand.pop();
            int second_card = second_hand.pop();

            if (first_card == 9 && second_card == 0){
                second_hand.add(0, first_card);
                second_hand.add(0, second_card);
            }
            else if (first_card == 0 && second_card == 9){
                first_hand.add(0, first_card);
                first_hand.add(0, second_card);
            }
            else if (first_card < second_card){
                second_hand.add(0, first_card);
                second_hand.add(0, second_card);
            }
            else{
                first_hand.add(0, first_card);
                first_hand.add(0, second_card);
            }

            System.out.println(first_hand);
            System.out.println(second_hand);
            turns++;
        }

        if (first_hand.empty())
            System.out.println("second " + turns);
        else if (second_hand.empty())
            System.out.println("first " + turns);
    }

    public static void ex2Queue(int[] cards){
        int turns = 0;

        Queue<Integer> first_hand = new LinkedList<>();
        Queue<Integer> second_hand = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            first_hand.offer(cards[i]);

        for (int i = 5; i < 10; i++)
            second_hand.offer(cards[i]);

        while (!first_hand.isEmpty() && !second_hand.isEmpty()){
            if (turns >= 106){
                System.out.println("botwa");
                break;
            }

            int first_card = first_hand.poll();
            int second_card = second_hand.poll();

            if (first_card == 9 && second_card == 0){
                second_hand.offer(first_card);
                second_hand.offer(second_card);
            }
            else if (first_card == 0 && second_card == 9){
                first_hand.offer(first_card);
                first_hand.offer(second_card);
            }
            else if (first_card < second_card){
                second_hand.offer(first_card);
                second_hand.offer(second_card);
            }
            else{
                first_hand.offer(first_card);
                first_hand.offer(second_card);
            }
            turns++;
        }

        if (first_hand.isEmpty())
            System.out.println("second " + turns);
        else if (second_hand.isEmpty())
            System.out.println("first " + turns);
    }

    public static void ex3Dequeue(int[] cards){
        int turns = 0;

        ArrayDeque<Integer> first_hand = new ArrayDeque<>();
        ArrayDeque<Integer> second_hand = new ArrayDeque<>();

        for (int i = 0; i < 5; i++)
            first_hand.add(cards[i]);

        for (int i = 5; i < 10; i++)
            second_hand.add(cards[i]);

        while (!first_hand.isEmpty() && !second_hand.isEmpty()){
            if (turns >= 106){
                System.out.println("botwa");
                break;
            }

            int first_card = first_hand.pop();
            int second_card = second_hand.pop();


            if (first_card == 9 && second_card == 0){
                second_hand.addLast(first_card);
                second_hand.addLast(second_card);
            }
            else if (first_card == 0 && second_card == 9){
                first_hand.addLast(first_card);
                first_hand.addLast(second_card);
            }
            else if (first_card < second_card){
                second_hand.addLast(first_card);
                second_hand.addLast(second_card);
            }
            else{
                first_hand.addLast(first_card);
                first_hand.addLast(second_card);
            }
            turns++;
        }

        if (first_hand.isEmpty())
            System.out.println("second " + turns);
        else if (second_hand.isEmpty())
            System.out.println("first " + turns);
    }

    public static void ex4DoubleList(int[] cards){
        int turns = 0;

        List<Integer> first_hand = new LinkedList<>();
        List<Integer> second_hand = new LinkedList<>();


        for (int i = 0; i < 5; i++)
            first_hand.add(cards[i]);

        for (int i = 5; i < 10; i++)
            second_hand.add(cards[i]);

        while (!first_hand.isEmpty() && !second_hand.isEmpty()){
            if (turns >= 106){
                System.out.println("botwa");
                break;
            }

            int first_card = first_hand.remove(0);
            int second_card = second_hand.remove(0);

            if (first_card == 9 && second_card == 0){
                second_hand.add(first_card);
                second_hand.add(second_card);
            }
            else if (first_card == 0 && second_card == 9){
                first_hand.add(first_card);
                first_hand.add(second_card);
            }
            else if (first_card < second_card){
                second_hand.add(first_card);
                second_hand.add(second_card);
            }
            else{
                first_hand.add(first_card);
                first_hand.add(second_card);
            }


            turns++;
        }

        if (first_hand.isEmpty())
            System.out.println("second " + turns);
        else if (second_hand.isEmpty())
            System.out.println("first " + turns);
    }
}

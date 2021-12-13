package ru.mirea.task26;

import java.util.Scanner;

interface PayStrategy{
    public void payment();
}

class eWalletStrategy implements PayStrategy{

    @Override
    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш заказ будет оплачен с помощью эл. кошелька");
        System.out.println("Введите номер карты: ");
        String card = sc.next();

        System.out.println("Введите пин код: ");
        int pin = sc.nextInt();

        System.out.println("Заказ оформлен");
    }
}

class debitCardStrategy implements PayStrategy{

    @Override
    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Отлично, оплатите заказ с помощью дебетовой карты.");
        System.out.println("Введите номер кошелька: ");
        String card = sc.next();

        System.out.println("Введите пин код: ");
        int pin = sc.nextInt();

        System.out.println("Заказ оформлен");
    }
}



public class Payment {
    int order_id;
    PayStrategy payStrategy;

    public Payment(int order_id) {
        this.order_id = order_id;
    }

    public void orderMade() {
        System.out.println("Отлично! Вы сделали заказ");
    }

    public void payment() {
        payStrategy.payment();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите артикул товара");
        int order = sc.nextInt();

        System.out.println("...Спасибо! Теперь выберите способ оплаты:");
        System.out.println("1 - Электронный кошелек");
        System.out.println("2 - Банковская карта");

        int action = sc.nextInt();
        Payment payment;
        switch (action) {
            case 1 -> payment = new eWalletPayment(order);
            case 2 -> payment = new debitCardPayment(order);
            default -> throw new IllegalStateException("Unexpected value!");
        }
        payment.payment();
    }
}

class eWalletPayment extends Payment {
    public eWalletPayment(int order_id) {
        super(order_id);
        this.payStrategy = new eWalletStrategy();
    }
}

class debitCardPayment extends Payment {
    public debitCardPayment(int order_id) {
        super(order_id);
        this.payStrategy = new debitCardStrategy();
    }
}
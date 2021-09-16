package ru.mirea.task3;

public class Human {
    protected Head head;
    protected Hand hand1;
    protected Hand hand2;
    protected Leg leg1;
    protected Leg leg2;


    public Human(Head head, Hand hand1, Hand hand2, Leg leg1, Leg leg2) {
        this.head = head;
        this.hand1 = hand1;
        this.hand2 = hand2;
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public Human() {
        this.head = new Head();
        this.hand1 = new Hand(1);
        this.hand2 = new Hand(2);
        this.leg1 = new Leg(1);
        this.leg2 = new Leg(2);
    }

    @Override
    public String toString() {
        return "Human{" +
                "\n\nhead=" + head +
                "\n\nhand1=" + hand1 +
                "\n\nhand2=" + hand2 +
                "\n\nleg1=" + leg1 +
                "\n\nleg2=" + leg2;
    }
}

package ru.mirea.task28;

public class Car {
    String model;
    String name;
    Wheels wheels;

    public Car(String model, String name, int radius) {
        this.model = model;
        this.name = name;
        this.wheels = new Wheels(radius);
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public Wheels getWheels() {
        return wheels;
    }

    private class Wheels{
        int radius;

        public Wheels(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }
    }

    public void sound(){
        System.out.println("Wroom-wroom!");
    }

    public static void main(String[] args){
        Car anonClownCar = new Car("Ferrari", "clowncar LUX", 50){
            @Override
            public void sound(){
                System.out.println("Beep-Boop-Beep-Boop");
            }
        };

        System.out.println("Model: " + anonClownCar.getModel());
        System.out.println("Name: " + anonClownCar.getName());
        System.out.println("Wheel radius: " + anonClownCar.getWheels().getRadius());
        anonClownCar.sound();

        System.out.println();

        Car justCar = new Car("Chevrolet", "Niva", 45);
        System.out.println("Model: " + justCar.getModel());
        System.out.println("Name: " + justCar.getName());
        System.out.println("Wheel radius: " + justCar.getWheels().getRadius());
        justCar.sound();
    }
}

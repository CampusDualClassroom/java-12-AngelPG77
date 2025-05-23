package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car coche1 = new Car();
        Car coche2 = new Car("Citröen", "Xsara Picasso", "Diesel");

        System.out.println("Esta el tacometro a cero: " + coche2.isTachometerGreaterThanZero());
        coche2.start();
        System.out.println("Esta el tacometro a cero: " + coche2.isTachometerGreaterThanZero());
        coche2.start();
        coche2.stop();
        coche2.start();
        coche2.speedometer = 5;
        coche2.stop();
        for (int i = 1; i <= 12; i++) {
            coche2.accelerate();
        }
        coche2.brake();
        for (int i = 1; i <= 12; i++) {
            coche2.brake();
        }
        coche2.turnAngleOfWheels(20);
        coche2.turnAngleOfWheels(20);
        coche2.turnAngleOfWheels(20);
        coche2.turnAngleOfWheels(-20);
        coche2.turnAngleOfWheels(-20);
        coche2.turnAngleOfWheels(-20);
        coche2.turnAngleOfWheels(-20);
        coche2.turnAngleOfWheels(-20);
        coche2.stop();
        coche2.setReverse(true);
        coche2.setReverse(false);
        coche2.start();
        for (int i = 1; i <= 6; i++) {
            coche2.accelerate();
        }
        coche2.setReverse(true);








    }

}
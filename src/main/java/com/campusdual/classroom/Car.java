package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;


    //Contructores

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){

    }

    //Metodos

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0 ? true : false;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0 ? true : false;
    }

    public void start() {
        if (isTachometerEqualToZero()){
            this.tachometer = 1000;
            System.out.println("Vehiculo acendido");
        } else {
            System.out.println("O vehiculo xa esta acendido");
        }
    }

    public void stop() {
        if (isTachometerGreaterThanZero() & this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println("Non se pode apagar o vehiculo");
        }
    }

    public void accelerate(){
        if (isTachometerGreaterThanZero() & (this.speedometer + 10) <= this.MAX_SPEED){
            this.speedometer += 10;
            System.out.println("El coche a acelerado y va a: " + this.speedometer + " km/h");
        } else {
            this.speedometer = MAX_SPEED;
            System.out.println("Ya vas a la maxima velocidad: " + this.speedometer + " km/h");
        }
    }

    public void brake() {
        if (isTachometerGreaterThanZero() & (this.speedometer - 10) >= 0) {
            this.speedometer -= 10;
            System.out.println("El coche a decelerado y va a: " + this.speedometer + " km/h");
        } else {
            this.speedometer = 0;
            System.out.println("El coche está parado, velocidad: " + this.speedometer + " km/h");
        }
    }

    public void turnAngleOfWheels(int angle){

        if ((this.wheelsAngle + angle) > 45){
            this.wheelsAngle = 45;
            System.out.println("No se puede girar mas de 45º");
        } else if ((this.wheelsAngle + angle) < -45) {
            this.wheelsAngle = -45;
            System.out.println("No se puede girar menos de 45º");
        } else {
            this.wheelsAngle += angle;
        }
        System.out.println("Se ha girado el volante " + angle + " grados, el total de giro es " + this.wheelsAngle);
    }


    public void setReverse(boolean reverse){
       if (!this.reverse & this.speedometer > 0){
           System.out.println("No se puede poner la marcha atras");
       } else {
           this.reverse = reverse;
           this.gear = "R";
       }
        System.out.println("Esta marcha atras: " + (this.reverse ? "Si" : "No"));

    }



}

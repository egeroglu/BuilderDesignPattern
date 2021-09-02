package dev.eroglu;

public class Main {

    public static void main(String[] args) {
        CarBuilder oldCar = new OldCarBuilder();
        CarDirector director = new CarDirector(oldCar);
        director.makeCar();
        Car first = director.getCar();
        
        System.out.println("Car built");
        System.out.println(first.getCarDoor());
        System.out.println(first.getCarWheel());
        System.out.println(first.getCarMirror());
        System.out.println(first.getCarSeat());
    }
}

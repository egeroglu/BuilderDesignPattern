package dev.eroglu;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    public Car getCar(){
        return this.carBuilder.getCar();
    }
    public void makeCar(){
        this.carBuilder.buildDoor();
        this.carBuilder.buildWheel();
        this.carBuilder.buildMirror();
        this.carBuilder.buildSeat();
    }
}

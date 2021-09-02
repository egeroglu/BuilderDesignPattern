package dev.eroglu;

public class OldCarBuilder implements CarBuilder{
    private Car car;

    public OldCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildDoor() {
        car.setCarDoor("big door");
    }

    @Override
    public void buildWheel() {
        car.setCarWheel("big wheel");
    }

    @Override
    public void buildMirror() {
        car.setCarMirror("big mirror");
    }

    @Override
    public void buildSeat() {
        car.setCarSeat("big seat");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}

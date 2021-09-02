package dev.eroglu;

public class Car implements CarPlan{
    private String carDoor;
    private String carWheel;
    private String carMirror;
    private String carSeat;

    @Override
    public void setCarDoor(String door) {
        carDoor = door;
    }

    @Override
    public void setCarWheel(String wheel) {
        carWheel = wheel;
    }

    @Override
    public void setCarMirror(String mirror) {
        carMirror = mirror;
    }

    @Override
    public void setCarSeat(String seat) {
        carSeat = seat;
    }

    public String getCarDoor() {
        return carDoor;
    }

    public String getCarWheel() {
        return carWheel;
    }

    public String getCarMirror() {
        return carMirror;
    }

    public String getCarSeat() {
        return carSeat;
    }
}

package domain.Car;

import static util.Constants.START_LOCATION;

public class RacingCar {

    private final String name;
    private int location;

    public RacingCar(String name) {
        this.name = name;
        this.location = START_LOCATION;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void move() {
        this.location++;
    }

}

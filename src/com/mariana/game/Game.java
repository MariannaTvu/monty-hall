package com.mariana.game;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by nicot on 10/4/2017.
 */
public class Game {
    private Doors[] doors = {Doors.FIRST, Doors.SECOND, Doors.THIRD};
    private Doors doorWithHiddenCar;
    private Doors firstAnswer;
    private Statistics tracker;

    public void hideCar() {
        doorWithHiddenCar = doors[new Random().nextInt(doors.length)];
    }

    public void acceptFirstAnswer(Doors door) {
        firstAnswer = Doors.getDoorByNumber(door.getValue());
    }

    public Doors openOneDoor() {
        doors = Arrays.stream(doors)
                .filter(door -> !door.equals(doorWithHiddenCar))
                .filter(door -> !door.equals(firstAnswer))
                .toArray(Doors[]::new);
        return doors[new Random().nextInt(doors.length)];
    }

    public void acceptSecondAnswer(Doors door) {
        if (door.equals(doorWithHiddenCar)) {
            tracker.setResult(Statistics.WIN);
        } else {
            tracker.setResult(Statistics.LOSE);
        }
    }

    public void setTracker(Statistics tracker) {
        this.tracker = tracker;
    }
}

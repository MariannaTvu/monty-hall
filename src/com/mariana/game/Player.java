package com.mariana.game;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by nicot on 10/4/2017.
 */
public class Player {
    private Doors selectedDoor;
    private Doors[] doors = {Doors.FIRST, Doors.SECOND, Doors.THIRD};

    public void seeOpenedDoor(Doors openedDoor) {
        doors = Arrays.stream(doors)
                .filter(door -> !door.equals(Doors.getDoorByNumber(openedDoor.getValue()))).toArray(Doors[]::new);
    }

    public Doors chooseDoor() {
        selectedDoor = getRandomDoorNum(doors);
        return selectedDoor;
    }

    public Doors getRandomDoorNum(Doors[] doors) {
        Integer rnd = new Random().nextInt(doors.length);
        return doors[rnd];
    }

    public Doors changeMind() {
        doors = Arrays.stream(doors)
                .filter(door -> !door.equals(Doors.getDoorByNumber(selectedDoor.getValue()))).toArray(Doors[]::new);
        return doors[0];
    }

    public Doors doNotChangeMind() {
        return selectedDoor;
    }
}

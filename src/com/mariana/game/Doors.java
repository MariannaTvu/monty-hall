package com.mariana.game;

/**
 * Created by nicot on 10/4/2017.
 */
public enum Doors {
    FIRST(1), SECOND(2), THIRD(3);

    private final Integer id;
    Doors(Integer id) { this.id = id; }

    public Integer getValue() {
        return id;
    }

    public static Doors getDoorByNumber(int number){
        for (Doors door : Doors.values()) {
            if (door.getValue() == number) {
                return door;
            }
        }
        throw new RuntimeException("no such door");
    }
}

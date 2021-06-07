package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    private static int nextId = 1;

    public Location() {
        super(nextId++);
    }

    public Location(String value) {
        super(nextId++, value);
    }

}

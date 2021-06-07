package org.launchcode.techjobs.oo;

public class Employer extends JobField {

    private static int nextId = 1;

    public Employer() {
        super(nextId++);
    }

    public Employer(String value) {
        super(nextId++, value);
    }

}

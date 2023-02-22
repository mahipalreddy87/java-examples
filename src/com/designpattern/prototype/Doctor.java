package com.designpattern.prototype;

public class Doctor implements Profession{
    @Override
    public String getProfession() {
        return "Doctor";
    }

    @Override
    public Profession getCloneMethod() {
        return new Doctor();
    }
}

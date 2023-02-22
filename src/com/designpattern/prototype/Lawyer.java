package com.designpattern.prototype;

public class Lawyer implements Profession{
    @Override
    public String getProfession() {
        return "lawyer";
    }

    @Override
    public Profession getCloneMethod() {
        return new Lawyer();
    }
}

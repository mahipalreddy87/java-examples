package com.designpattern.prototype;

public class Engineer implements Profession {
    @Override
    public String getProfession() {
        return "Engineer";
    }

    @Override
    public Profession getCloneMethod() {
        return new Engineer();
    }
}

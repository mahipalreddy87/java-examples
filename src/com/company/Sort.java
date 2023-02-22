package com.company;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("5");
        sList.add("6");
        sList.add("7");
        sList.add("6");
        sList.add("8");
        Collections.sort(sList);    //sorts array list
        for (String str : sList)
            System.out.print(" " + str);
    }
}

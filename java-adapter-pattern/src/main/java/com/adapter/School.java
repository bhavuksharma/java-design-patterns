package com.adapter;

public class School {
    public static void main(String[] args){
        AssignmentWork aw = new AssignmentWork();
        IPen pen = new PenAdapter();
        aw.setPen(pen);
        aw.writeAssignment("I am tired to write any assignment");
    }
}

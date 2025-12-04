package com.adapter;

public class School {
    public static void main(String[] args){
        IPen pen = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setPen(pen);
        aw.writeAssignment("I am so tired to write any assignment");
    }
}

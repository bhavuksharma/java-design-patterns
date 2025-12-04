package com.adapter;

public class AssignmentWork {

    private IPen pen;
    public void setPen(IPen pen) {
        this.pen = pen;
    }

    public void writeAssignment(String str){
        pen.write(str);
    }
}

package com.adapter;

import org.example.PilotPen;

public class PenAdapter implements IPen{

    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);
    }
}

package com.example.softwaretest;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    List<Integer> data = new ArrayList<>();

    public Integer pop() {
        if (size() <= 0) throw new IllegalStateException("have no element");
        return data.get(size() - 1);
    }

    public void push(int i) {
        data.add(i);
    }

    public int size() {
        return data.size();
    }
}

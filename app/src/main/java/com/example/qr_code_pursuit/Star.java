package com.example.qr_code_pursuit;

public class Star extends Shape {

    public Star(Integer points, Integer size) {
        x = points;
        y = size;
    }

    public Integer shineArea() {
        return x*y;
    }

}

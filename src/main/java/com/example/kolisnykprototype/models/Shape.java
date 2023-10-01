package com.example.kolisnykprototype.models;

import java.util.Objects;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape() {}

    public Shape(Shape shape) {
        if (shape == null) return;

        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;

        Shape shape2 = (Shape) object2;
        boolean isSameX = shape2.x == x;
        boolean isSameY = shape2.y == y;
        boolean isSameColor = Objects.equals(shape2.color, color);

        return isSameX && isSameY && isSameColor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

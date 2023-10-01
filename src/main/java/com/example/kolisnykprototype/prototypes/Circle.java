package com.example.kolisnykprototype.prototypes;

import com.example.kolisnykprototype.models.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle() {};

    public Circle(Circle circle) {
        super(circle);

        if (circle == null) return;

        this.radius = circle.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;

        Circle shape2 = (Circle) object2;

        return shape2.radius == radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

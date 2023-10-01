package com.example.kolisnykprototype;

import com.example.kolisnykprototype.models.Shape;
import com.example.kolisnykprototype.prototypes.Circle;
import com.example.kolisnykprototype.prototypes.Rectangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KolisnykPrototypeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(KolisnykPrototypeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(KolisnykPrototypeApplication.class, args);

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                LOGGER.info(i + ": Shapes are different objects");

                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    LOGGER.info(i + ": And they are identical");
                } else {
                    LOGGER.info(i + ": But they are not identical");
                }
            } else {
                LOGGER.info(i + ": Shape objects are the same");
            }
        }
    }

}

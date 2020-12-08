package day9.Task2;

import static java.lang.Math.PI;

public class Circle extends Figure {
    double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * PI;
    }
}

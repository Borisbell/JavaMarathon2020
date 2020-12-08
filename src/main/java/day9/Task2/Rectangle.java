package day9.Task2;

public class Rectangle extends Figure{
    public double width;
    public double height;

    public Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimeter() {
        return 2*(width+height);
    }
}

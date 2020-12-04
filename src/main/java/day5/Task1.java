package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Blue");
        car.setModel("Firebird");
        car.setYear(1977);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getYear() );
    }
}

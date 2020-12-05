package day6;

public class Task1 {
    public static void main(String[] args) {
    Motorbike bike = new Motorbike(1990, "green", "Kawasaki");
    Car car = new Car();
    car.setColor("Red");
    car.setYear(2010);
    car.setModel("Priora");
    car.info();
    bike.info();
    System.out.println(bike.yearDifference(2020));;
    }
}

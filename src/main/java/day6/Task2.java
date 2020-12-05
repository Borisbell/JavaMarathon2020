package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Airbus", 1990, 50000, 100000);
        plane.setLength(70000);
        plane.setYear(2010);
        plane.fillUp(1000);
        plane.fillUp(1900);
        plane.info();
    }
}

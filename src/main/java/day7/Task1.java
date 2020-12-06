package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 1999, 24000, 30000);
        Airplane plane2 = new Airplane("Airbus", 1999, 24000, 30000);
        Airplane.compareAirplanes(plane1, plane2);
    }
}
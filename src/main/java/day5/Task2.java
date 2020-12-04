package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike( 1957, "Chrome", "Harley-Davidson Sportster" );
        System.out.println(bike.getYear() + " " + bike.getColor() + " " + bike.getModel());
    }
}

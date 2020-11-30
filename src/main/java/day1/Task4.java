package day1;

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        while (year < 2021) {
            System.out.printf(String.format("Олимпиада %s года%n", year));
            year += 4;
        }
    }
}

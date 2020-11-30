package day1;

public class Task5 {
    public static void main(String[] args) {
        int year = 1980;
        for (; year < 2021; year += 4) {
            System.out.printf("Олимпиада " + year + " года%n");
        }
    }
}

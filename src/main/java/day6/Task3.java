package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Галина", "ОБЖ");
        Student student = new Student("Эдуард");
        teacher.evaluate(student);
    }
}

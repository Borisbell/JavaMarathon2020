package day6;

import java.util.HashMap;
import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random rand = new Random();
        int mark = 2 + rand.nextInt(4);;
        HashMap<Integer, String> markRef = new HashMap<>();
        markRef.put(2, "неудовлетворительно");
        markRef.put(3, "удовлетворительно");
        markRef.put(4, "хорошо");
        markRef.put(5, "отлично");

        System.out.println("Преподаватель "+this.name+" оценил студента с именем "+student.getName()+" по предмету "+this.subject+" на оценку "+markRef.get(mark)+".");
    }
}

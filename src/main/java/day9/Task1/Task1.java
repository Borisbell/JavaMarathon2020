package day9.Task1;

import javax.sound.midi.Soundbank;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Karl", "GroupA");
        Teacher teach = new Teacher("Klarisa", "Math");
        System.out.println(student.getGroupName() +" : "+teach.getSubjectName());
        student.printInfo();
        teach.printInfo();
    }
}

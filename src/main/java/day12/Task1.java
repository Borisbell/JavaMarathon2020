package day12;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Citroen");
        list.add("Peugeot");
        list.add("Renault");
        list.add("Bugatti");
        list.add("Alpine");
        System.out.println(list);

        list.add(list.size()/2,"Dacia");
        list.removeFirst();
        System.out.println(list);
    }
}

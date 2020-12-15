package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String nameAge = scanner.nextLine();
                String[] numString = nameAge.split(" ");
                if (Integer.parseInt(numString[1]) < 0) {
                        throw new IllegalArgumentException();
                }
                Person person = new Person(numString[0], Integer.parseInt(numString[1]));
                data.add(person);
            }
            scanner.close();
            return data;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
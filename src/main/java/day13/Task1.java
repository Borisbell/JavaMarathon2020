package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Artem");
        User u2 = new User("Anastasia");
        User u3 = new User("Vasiliy");

        u1.sendMessage(u2, "Привет");
        u1.sendMessage(u2, "Не отвлекаю");

        u2.sendMessage(u1, "Привет");
        u2.sendMessage(u1, "Нет");
        u2.sendMessage(u1, "Что случилось?");

        u3.sendMessage(u1, "Йо");
        u3.sendMessage(u1, "Писал Насте");
        u3.sendMessage(u1, "Что говорит?");

        u1.sendMessage(u3, "Да");
        u1.sendMessage(u3, "Только что");
        u1.sendMessage(u3, "Вроде свободна");

        u3.sendMessage(u1, "Интересно");

        MessageDatabase.showDialog(u1, u3);
        System.out.println("___________");
        MessageDatabase.showDialog(u1, u2);
    }
}

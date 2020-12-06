package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int stamina = 90 + rand.nextInt(9);

        Player player1 = new Player(stamina);
        Player player2 = new Player(stamina);
        Player player3 = new Player(stamina);
        Player player4 = new Player(stamina);
        Player player5 = new Player(stamina);
        Player player6 = new Player(stamina);

        Player.info();
        while(player2.getStamina()>0){
            player2.run();
        }

        Player.info();
    }
}

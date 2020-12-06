package day7;

public class Player {
    private int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    static int countPlayers;


    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        if(countPlayers > 6){
            countPlayers = 6;
        }
        return countPlayers;
    }

    public void run() {
        if (stamina <= 1) {
            stamina = 0;
            if (countPlayers > 0) {
                countPlayers--;
            } else {
                countPlayers = 0;
            }
        }else{
            stamina--;
        }
    }

    public static void info() {
        if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле ещё есть 5 свободных мест");
        } else if (countPlayers == 1) {
            System.out.println("Команды неполные. На поле ещё есть одно свободное место");
        } else if (countPlayers > 1 && countPlayers < 5) {
            System.out.println("Команды неполные. На поле ещё есть " + (6 - countPlayers) + " свободных места");
        } else if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else if (countPlayers > 6) {
            System.out.println("Ошибка, игроков больше допустимого");
        }
    }

}

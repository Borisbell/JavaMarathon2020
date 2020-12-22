package Battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private int score = 0;
    private GameBoard enemyBoard;
    private List<PairInt> shots = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player(String name, GameBoard board) {
        this.name = name;
        enemyBoard = board;
    }

    public void shoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты выстрела. (Формат x,y)");
        String line = scanner.nextLine();
        String[] numString = line.split(",");
        int x = Integer.parseInt(numString[0]);
        int y = Integer.parseInt(numString[1]);
        if (x < 10 && x >= 0 && y < 10 && y >= 0) {
            PairInt shot = new PairInt(x, y);
            shots.add(shot);
            if (enemyBoard.getPosition(x, y).equals("\uD83D\uDFE6") || enemyBoard.getPosition(x, y).equals("\u2B1C")) {
                enemyBoard.showMiss(x, y);
                System.out.println("Мимо");
                enemyBoard.printBoard();
            } else if (enemyBoard.getPosition(x, y).equals("\uD83D\uDEE5")) {
                enemyBoard.shipTurnRed(x, y);
                findShotShip(x,y).setShipHealth(findShotShip(x,y).getShipHealth()-1);
                if (isShipDead(findShotShip(x, y))) {
                    System.out.println("Убил");
                    score++;
                } else {
                    System.out.println("Попал");
                }
                enemyBoard.printBoard();
            }
        } else {
            System.out.println("Координаты вне игрового поля, введите повторно (цифры от 0 до 9)");
        }
    }

    public Ship findShotShip(int x, int y) {
        PairInt shot = new PairInt(x, y);
        for (Ship ship : enemyBoard.getListOfShips()) {
            for (PairInt pair : ship.getCoordinates()) {
                if (pair.equals(shot)) {
                    System.out.println(ship);
                    return ship;
                }
            }
        }
        System.out.println("Не нашёл");
        return null;
    }

    public boolean isShipDead(Ship ship) {
        if (ship.getShipHealth() == 0) {
            return true;
        }
        return false;
    }
}

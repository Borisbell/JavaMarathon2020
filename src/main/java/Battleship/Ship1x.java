package Battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ship1x extends Ship {
    private int shipHealth = 1;
    private GameBoard board;
//    private int[] xCoordinates = new int[1];
//    private int[] yCoordinates = new int[1];
    private List<PairInt> coordinates = new ArrayList<>();

    public Ship1x(GameBoard board) {
        this.board = board;
    }

    public void setShip1x() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты однопалубный корабля. (Формат x,y)");
            String line = scanner.nextLine();
            String[] numString = line.split(",");
            x = Integer.parseInt(numString[0]);
            y = Integer.parseInt(numString[1]);
        } while (!checkShip1xCoords(x, y));
        System.out.println("Принято");

        for (int i = x - 1; i < x + 2; i++) {
            try {
                for (int j = y - 1; j < y + 2; j++) {
                    if (i > -1 && i < 10 && j > -1 && j < 10)
                        board.setMarginOnBoard(i, j);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
        board.setShipOnBoard(x, y);
        PairInt pair = new PairInt(x,y);
        coordinates.add(pair);
        board.getListOfShips().add(this);
    }

    public boolean checkShip1xCoords(int x, int y) {
        if (inRange(x) && inRange(y)) {
            if (checkWater(x, y)) return true;
            else {
                System.out.println("Поле занято");
                return false;
            }
        } else {
            System.out.println("Координаты должны быть от 0 до 9");
            return false;
        }
    }

    public boolean checkWater(int x, int y) {
        if (board.getPosition(x, y).equals("\u2B1C")) return true;
        else return false;
    }

    @Override
    public int getShipHealth() {
        return shipHealth;
    }

    @Override
    public void setShipHealth(int shipHealth) {
        this.shipHealth = shipHealth;
    }

    @Override
    public List<PairInt> getCoordinates() {
        return coordinates;
    }
}

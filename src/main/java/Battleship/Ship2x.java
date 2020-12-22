package Battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ship2x extends Ship {
    private int shipHealth = 2;
    private GameBoard board;
//    private int[] xCoordinates = new int[2];
//    private int[] yCoordinates = new int[2];
    private List<PairInt> coordinates = new ArrayList<>();

    public Ship2x(GameBoard board) {
        this.board = board;
    }

    public void setShip2x() {
        int x1, y1, x2, y2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты двухпалубный корабля. (Формат x1, y1; x2, y2)");
            String line = scanner.nextLine();
            String[] String1 = line.split(";");
            String[] firstPair = String1[0].split(",");
            String[] secondPair = String1[1].split(",");
            x1 = Integer.parseInt(firstPair[0]);
            y1 = Integer.parseInt(firstPair[1]);
            x2 = Integer.parseInt(secondPair[0]);
            y2 = Integer.parseInt(secondPair[1]);
        } while (!checkShip2xCoords(x1, y1, x2, y2));
        System.out.println("Принято");

        try {
            for (int i = x1 - 1; i < x2 + 2; i++) {
                for (int j = y1 - 1; j < y2 + 2; j++) {
                    if (i > -1 && i < 10 && j > -1 && j < 10)
                    board.setMarginOnBoard(i, j);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        board.setShipOnBoard(x1, y1);
        board.setShipOnBoard(x2, y2);
//        xCoordinates[0] = x1;
//        xCoordinates[1] = x2;
//        yCoordinates[0] = y1;
//        yCoordinates[1] = y2;
        PairInt pair1 = new PairInt(x1,y1);
        PairInt pair2 = new PairInt(x2,y2);
        coordinates.add(pair1);
        coordinates.add(pair2);
        board.getListOfShips().add(this);
    }

    public boolean checkShip2xCoords(int x1, int y1, int x2, int y2) {
        if (inRange(x1) && inRange(x2) && inRange(y1) && inRange(y2)) {
            if(checkWater(x1,y1) && checkWater(x2,y2)) {
                if (allEqual(x1, x2) && (y1 + 1 == y2)) {
                    return true;
                } else if (allEqual(y1, y2) && (x1 + 1 == x2)) {
                    return true;
                }
                else {
                    System.out.println("Координаты должны повторяться для одной оси (напр. 2, y1; 2, y2 ;..) и идти подряд для второй оси");
                    return false;
                }
            }
            else{
                System.out.println("Поле занято");
                return false;
            }
        }
         else {
            System.out.println("Коорлинаты должны быть от 0 до 9");
            return false;
        }
    }

    public boolean checkWater(int x, int y){
        if (board.getPosition(x,y).equals("\u2B1C")) return true;
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

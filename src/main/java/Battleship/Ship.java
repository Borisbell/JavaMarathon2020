package Battleship;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    private GameBoard board;
    private int shipHealth;
//    private int[] xCoordinates;
//    private int[] yCoordinates;

    private List<PairInt> coordinates = new ArrayList<>();
    public Ship() {
    }

    public Ship(GameBoard board) {
        this.board = board;
    }

    public boolean allEqual(Object key, Object... objs) {
        for (Object o : objs) if (!o.equals(key)) return false;
        return true;
    }

    public boolean inRange(int x) {
        if (x >= 0 && x < 10) return true;
        else return false;
    }

    public int getShipHealth() {
        return shipHealth;
    }

    public void setShipHealth(int shipHealth) {
        this.shipHealth = shipHealth;
    }

    public List<PairInt> getCoordinates() {
        return coordinates;
    }

}

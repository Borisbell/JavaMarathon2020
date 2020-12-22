package Battleship;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private String[][] board = {
            {"\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"},
            {"\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"},
            {"\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"},
            {"\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"},
            {"\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"},
            {"\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"},
            {"\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"},
            {"\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"},
            {"\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"},
            { "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C", "\u2B1C"}
    };

    private List<Ship> listOfShips = new ArrayList<>();

    public List<Ship> getListOfShips() {
        return listOfShips;
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public  String getPosition(int x, int y){
        return board[y][x];
    }

    public void setMarginOnBoard (int x, int y){
        board[y][x] = "\uD83D\uDFE6";
    }

    public void showMiss (int x, int y){
        board[y][x] = "\u2611";
    }

    public void setShipOnBoard (int x, int y){
        board[y][x] = "\uD83D\uDEE5";
    }

    public void shipTurnRed (int x, int y){
        board[y][x] = "\uD83D\uDFE5";
    }

}




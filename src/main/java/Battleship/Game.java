package Battleship;

public class Game {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        Ship1x ship1 = new Ship1x(board);
        ship1.setShip1x();

        Ship2x ship2 = new Ship2x(board);
        ship2.setShip2x();

        Ship3x ship3 = new Ship3x(board);
        ship3.setShip3x();

        Ship4x ship4 = new Ship4x(board);
        ship4.setShip4x();

        board.printBoard();

        Player Boris = new Player("Boris", board);


        Boris.shoot();
        Boris.shoot();
    }

}

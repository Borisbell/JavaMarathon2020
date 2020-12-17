package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> pieces = new ArrayList<>();
        ChessPiece piece1 = ChessPiece.PAWN_WHITE;
        ChessPiece piece2 = ChessPiece.ROOK_BLACK;
        for (int i = 0; i < 4; i++) {
            pieces.add(piece1);
        }

        for (int i = 0; i < 4; i++) {
            pieces.add(piece2);
        }

        for(ChessPiece piece : pieces){
            System.out.print(piece.getSign()+ " ");
        }
    }
}
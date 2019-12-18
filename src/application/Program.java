package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPositon;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPositon source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPositon target = UI.readChessPosition(sc);

            ChessPiece captured = chessMatch.performChessMove(source, target);
        }
    }

}

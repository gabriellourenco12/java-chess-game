package chess.piece;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;
import lombok.NonNull;

public class King extends ChessPiece {
    public King(@NonNull Board board, Color color) {
        super(board, color);
    }

    @Override
    public  String toString(){
        return "K";
    }
}

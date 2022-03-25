package chess;

import boardgame.Board;
import boardgame.Piece;
import lombok.Getter;
import lombok.NonNull;

public abstract class ChessPiece extends Piece {

    @Getter
    private Color color;

    public ChessPiece(@NonNull Board board, Color color) {
        super(board);
        this.color = color;
    }
}

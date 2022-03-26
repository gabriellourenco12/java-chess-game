package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import lombok.Getter;
import lombok.NonNull;

public abstract class ChessPiece extends Piece {

    @Getter
    private Color color;

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    public ChessPiece(@NonNull Board board, Color color) {
        super(board);
        this.color = color;
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}

package boardgame;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Piece {

    protected Position position;

    @Getter
    @NonNull
    protected Board board;
}

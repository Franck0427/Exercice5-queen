class Piece {
    Position position;

    boolean isValidMove(Position newPosition) {
        // Vérifie si la position est bien dans les limites de l'échiquier
        if (newPosition.row >= 1 && newPosition.column >= 1
                && newPosition.row <= 8 && newPosition.column <= 8) {
            return true;
        } else {
            return false;
        }
    }
}
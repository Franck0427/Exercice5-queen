class Bishop extends Piece {
    @Override
    boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        // Logique spécifique au Fou
        if (Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)) {
            return true;
        } else {
            return false;
        }
    }
}
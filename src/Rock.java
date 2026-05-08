class Rock extends Piece {
    @Override
    boolean isValidMove(Position newPosition) {
        // On vérifie d'abord si le mouvement est dans les limites du plateau
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        // Logique spécifique à la Tour
        if (newPosition.column == this.position.column || newPosition.row == this.position.row) {
            return true;
        } else {
            return false;
        }
    }
}
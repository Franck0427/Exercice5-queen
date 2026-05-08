class Queen extends Piece {

    @Override
    boolean isValidMove(Position newPosition) {
        // 1. On vérifie d'abord si la position est sur le plateau (via la classe Piece)
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        // 2. Logique de la Reine : Mouvement de Tour OU mouvement de Fou

        // Condition de la Tour (Rock)
        boolean isRockMove = (newPosition.column == this.position.column || newPosition.row == this.position.row);

        // Condition du Fou (Bishop)
        boolean isBishopMove = (Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row));

        // La reine est valide si l'une des deux conditions est vraie
        if (isRockMove || isBishopMove) {
            return true;
        } else {
            return false;

        }
    }
}
# EXERCICE 5 #

# Système de Mouvement des Pièces d'Échecs - Java (JDK 21)

Ce projet implémente les règles de déplacement des pièces d'échecs (Tour, Fou, Reine) en utilisant les principes de la programmation orientée objet (POO) en Java.

## Architecture du Projet
.
├── Bishop.java
├── Piece.java
├── Position.java
├── Queen.java
└── Rock.java

Le projet est divisé en plusieurs fichiers :

- `Position.java` : Classe de base représentant les coordonnées (Ligne, Colonne).
- `Piece.java` : Classe parente contenant la position actuelle et la validation des limites du plateau.
- `Rock.java` : Implémentation du mouvement de la Tour.
- `Bishop.java` : Implémentation du mouvement du Fou.
- `Queen.java` : Implémentation du mouvement de la Reine (Exercice 5).

## Logique de l'Exercice 5 (La Reine)

La classe `Queen` hérite de `Piece`. Sa méthode `isValidMove` effectue deux vérifications :
1. **Validation Globale** : Utilise `super.isValidMove` pour vérifier que la destination est sur le plateau (entre 1 et 8).
2. **Validation Spécifique** : La reine est valide si son mouvement correspond soit à celui d'une Tour (même ligne ou même colonne), soit à celui d'un Fou (diagonale parfaite).


## Installation et Compilation

# Important a savoir Assurez-vous d'avoir installé le JDK 21.


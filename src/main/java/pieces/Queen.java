package pieces;

import jeu.Couleur;
import plateau.Case;

import java.util.ArrayList;

public class Queen extends Piece {


    // Constructeurs

    public Queen(Couleur couleur) {
        super(couleur, 'Q');
    }

    public Queen(Piece piece) {
        super(piece);
    }


    // Méthodes & Fonctions

    @Override
    public ArrayList<Case> getJouables() {
        //TODO must be implemented
        return null;
    }
}

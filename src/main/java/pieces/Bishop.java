package pieces;

import jeu.Couleur;
import plateau.Case;

import java.util.ArrayList;

public class Bishop extends Piece {


    // Constructeurs

    public Bishop(Couleur couleur) {
        super(couleur, 'B');
    }

    public Bishop(Piece piece) {
        super(piece);
    }


    // Méthodes & Fonctions

    @Override
    public ArrayList<Case> getJouables() {
        //TODO must be implemented
        return null;
    }
}

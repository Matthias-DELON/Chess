package pieces;

import jeu.Couleur;
import plateau.Case;

import java.util.ArrayList;

public class King extends Piece {


    // Constructeurs

    public King(Couleur couleur) {
        super(couleur, 'K');
    }

    public King(Piece piece) {
        super(piece);
    }


    // Méthodes & Fonctions


    @Override
    public ArrayList<Case> getJouables() {
        //TODO must be implemented
        return null;
    }
}

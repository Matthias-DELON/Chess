package pieces;

import jeu.Couleur;
import plateau.Case;

import java.util.ArrayList;

public class Pawn extends Piece{


    // Constructeurs

    public Pawn(Couleur couleur) {
        super(couleur, 'P');
    }

    public Pawn(Piece piece) {
        super(piece);
    }


    // Méthodes & Fonctions

    @Override
    public ArrayList<Case> getJouables() {
        //TODO must be implemented
        return null;
    }

}

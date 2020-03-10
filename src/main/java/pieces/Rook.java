package pieces;

import jeu.Couleur;
import plateau.Case;

import java.util.ArrayList;

public class Rook extends Piece {


    // Constructeurs

    public Rook(Couleur couleur) {
        super(couleur, 'R');
    }

    public Rook(Piece piece) {
        super(piece);
    }


    // Méthodes & Fonctions


    @Override
    public ArrayList<Case> getJouables() {
        return null;
    }
}

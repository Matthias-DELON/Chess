package pieces;

import jeu.Couleur;
import plateau.Case;

import java.util.ArrayList;

public class Knight extends Piece {


    // Constructeurs

    public Knight(Couleur couleur) {
        super(couleur, 'N');
    }

    public Knight(Piece piece) {
        super(piece);
    }


    // Méthdes & Fonctions

    @Override
    public ArrayList<Case> getJouables() {
        //TODO must be implemented;
        return null;
    }
}

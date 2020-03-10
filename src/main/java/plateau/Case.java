package plateau;

import jeu.Couleur;
import pieces.Piece;

public class Case {

    private Couleur couleur;
    private Piece piece;


    // Constructeurs

    public Case(Couleur couleur) {
        this.couleur = couleur;
    }

    public Case(Couleur couleur, Piece piece) {
        this.couleur = couleur;
        this.piece = piece;
    }


    // Getters & Setters

    public boolean isEmpty(){
        return this.piece == null;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    // Méthodes & Fonctions

    @Override
    public String toString() {
        if(this.isEmpty()){
            return this.couleur.toString();
        }else{
            return this.piece.toString();
        }
    }
}

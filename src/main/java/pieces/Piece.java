package pieces;

import jeu.Couleur;
import plateau.Case;

import java.util.ArrayList;

public abstract class Piece {

    private Couleur couleur;


    // Constructeurs

    public Piece(Couleur couleur){
        this.couleur = couleur;
    }

    public Piece(Piece piece){
        this.couleur = piece.couleur;
    }


    // Getters & Setters

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }


    // Méthodes & Fonctions

    /**
     *
     * @return L'ensemble des cases sur lesquelles peut être jouée la pièce.
     */
    public abstract ArrayList<Case> getJouables();

    @Override
    public abstract String toString();

}

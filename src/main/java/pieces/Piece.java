package pieces;

import jeu.Couleur;
import plateau.Case;

import java.util.ArrayList;

public abstract class Piece {

    private Couleur couleur;
    private char letter;


    // Constructeurs

    public Piece(Couleur couleur, char letter){
        this.couleur = couleur;
        if(this.couleur.equals(Couleur.Blanc)){
            this.letter = Character.toUpperCase(letter);
        }else {
            this.letter = Character.toLowerCase(letter);
        }
    }

    public Piece(Piece piece){
        this.couleur = piece.couleur;
        this.letter = piece.letter;
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
    public String toString(){
        return this.couleur  + "" + this.letter;
    };

}

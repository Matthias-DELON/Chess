package plateau;

import jeu.Couleur;
import pieces.Piece;

import java.util.Arrays;

public class Echiquier {

    private Case[][] cases;


    // Constructeurs

    public Echiquier() {
        this.cases = new Case[8][8];
        boolean blanche = true;
        for (int i = 0; i < this.cases.length; i++) {
            for (int j = 0; j < this.cases[i].length; j++) {
                if(blanche){
                    this.cases[i][j] = new Case(Couleur.Blanc);
                }else{
                    this.cases[i][j] = new Case(Couleur.Noir);
                }
                if(j != this.cases.length-1){
                    blanche = !blanche;
                }
            }
        }
    }


    // Getters & Setters

    public Case[][] getCases() {
        return cases;
    }

    public void setPiece(Piece piece, int lig, int col){
        this.cases[lig][col].setPiece(piece);
    }


    // Méthodes & Fonctions


    @Override
    public String toString() {
        /*    a b c d e f g h
         *   +---------------
         *  8|B N B N B N B N
         *  7|N B N B N B N B
         *  6|B N B N B N B N
         *  5|N B N B N B N B
         *  4|B N B N B N B N
         *  3|N B N B N B N B
         *  2|B N B N B N B N
         *  1|N B N B N B N B
         */
        String res = "";
        String ligne = "  a b c d e f g h\n";
        res += ligne;
        ligne = " +---------------\n";
        res += ligne;
        for (int i = 0; i < this.cases.length; i++) {
            ligne = (8-i) + "|";
            for (int j = 0; j < this.cases[i].length; j++) {
                ligne += this.cases[i][j] + " ";
            }
            ligne = ligne.substring(0, ligne.length()-1) + "\n";
            res += ligne;
        }
        return res;
    }
}

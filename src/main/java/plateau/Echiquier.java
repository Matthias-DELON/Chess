package plateau;

import jeu.Couleur;
import jeu.Player;
import pieces.*;

import java.util.Arrays;

public class Echiquier {

    private Case[][] cases;
    private Player[] players;
    private Piece[] piecesBlanches;
    private Piece[] piecesNoires;


    // Constructeurs

    public Echiquier(Player player1, Player player2) {
        // Echiquier vide
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

        // Players
        this.players = new Player[2];
        this.players[0] = player1;
        this.players[1] = player2;

        // Création des Pieces blanches
        this.piecesBlanches = new Piece[16];
        this.piecesBlanches[0] = new Rook(Couleur.Blanc);
        this.piecesBlanches[1] = new Knight(Couleur.Blanc);
        this.piecesBlanches[2] = new Bishop(Couleur.Blanc);
        this.piecesBlanches[3] = new Queen(Couleur.Blanc);
        this.piecesBlanches[4] = new King(Couleur.Blanc);
        this.piecesBlanches[5] = new Bishop(Couleur.Blanc);
        this.piecesBlanches[6] = new Knight(Couleur.Blanc);
        this.piecesBlanches[7] = new Rook(Couleur.Blanc);
        for (int i = 8; i < this.piecesBlanches.length; i++) {
            this.piecesBlanches[i] = new Pawn(Couleur.Blanc);
        }

        // Création des Pieces noires
        this.piecesNoires = new Piece[16];
        this.piecesNoires[0] = new Rook(Couleur.Noir);
        this.piecesNoires[1] = new Knight(Couleur.Noir);
        this.piecesNoires[2] = new Bishop(Couleur.Noir);
        this.piecesNoires[3] = new Queen(Couleur.Noir);
        this.piecesNoires[4] = new King(Couleur.Noir);
        this.piecesNoires[5] = new Bishop(Couleur.Noir);
        this.piecesNoires[6] = new Knight(Couleur.Noir);
        this.piecesNoires[7] = new Rook(Couleur.Noir);
        for (int i = 8; i < this.piecesNoires.length; i++) {
            this.piecesNoires[i] = new Pawn(Couleur.Noir);
        }


        // Positionnement des pièces blanches
        // Ligne 1
        for (int i = 0; i < this.cases[7].length; i++) {
            this.cases[7][i].setPiece(this.piecesBlanches[i]);
        }
        // Ligne 2
        for (int i = 0; i < this.cases[6].length; i++) {
            this.cases[6][i].setPiece(this.piecesBlanches[i+8]);
        }

        // Positionnement des pièces blanches
        // Ligne 8
        for (int i = 0; i < this.cases[0].length; i++) {
            this.cases[0][i].setPiece(this.piecesNoires[i]);
        }
        // Ligne 7
        for (int i = 0; i < this.cases[1].length; i++) {
            this.cases[1][i].setPiece(this.piecesNoires[i+8]);
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
        /*    a  b  c  d  e  f  g  h
         *   +-----------------------
         *  8|B_ N_ B_ N_ B_ N_ B_ N_
         *  7|N_ B_ N_ B_ N_ B_ N_ B_
         *  6|B_ N_ B_ N_ B_ N_ B_ N_
         *  5|N_ B_ N_ B_ N_ B_ N_ B_
         *  4|B_ N_ B_ N_ B_ N_ B_ N_
         *  3|N_ B_ N_ B_ N_ B_ N_ B_
         *  2|B_ N_ B_ N_ B_ N_ B_ N_
         *  1|N_ B_ N_ B_ N_ B_ N_ B_
         */
        String res = "";
        String ligne = "  a  b  c  d  e  f  g  h \n";
        res += ligne;
        ligne = " +-----------------------\n";
        res += ligne;
        for (int i = 0; i < this.cases.length; i++) {
            ligne = (8-i) + "|";
            for (int j = 0; j < this.cases[i].length; j++) {
                ligne += this.cases[i][j] + " ";
            }
            ligne = ligne.substring(0, ligne.length()-1) + "\n";
            res += ligne;
        }
        ligne = " +-----------------------\n";
        res += ligne;
        return res;
    }
}

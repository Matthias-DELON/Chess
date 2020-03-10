package jeu;

import pieces.Piece;

public class Player {

    private String pseudo;
    private int score;
    private Couleur couleur;


    // Constructeurs

    public Player(Couleur couleur, String pseudo){
        this.couleur = couleur;
        this.pseudo = pseudo;
        this.score = 0;
    }


    // Getters & Setters

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }


    // Méthodes & Fonctions

    @Override
    public String toString() {
        return "Player{" +
                "pseudo='" + pseudo + '\'' +
                ", score=" + score +
                ", couleur=" + couleur +
                '}';
    }
}

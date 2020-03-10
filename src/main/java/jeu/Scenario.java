package jeu;

import plateau.Echiquier;

public class Scenario {

    private Player[] players;
    private Echiquier echiquier;


    // Constructeurs

    public Scenario(Player[] players) {
        this.players = players;
        this.echiquier = new Echiquier(this.players[0], this.players[1]);
    }


    // Getters & Setters

    public Echiquier getEchiquier() {
        return echiquier;
    }

    public void setEchiquier(Echiquier echiquier) {
        this.echiquier = echiquier;
    }


    // Méthodes & Fonctions

    @Override
    public String toString() {
        String res = this.players[0] + "\n";
        res += this.players[1] + "\n";
        res += this.echiquier.toString();
        return res;
    }
}

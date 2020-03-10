package jeu;

import plateau.Echiquier;

public class Scenario {

    private Echiquier echiquier;


    // Constructeurs

    public Scenario(){
        this.echiquier = new Echiquier();
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
        return this.echiquier.toString();
    }
}

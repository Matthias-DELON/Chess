package jeu;

public enum Couleur {

    Noir ("N"),
    Blanc ("B");

    private String name = "";

    // Constructeur
    Couleur(String name){
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

}

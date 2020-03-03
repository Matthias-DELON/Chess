public enum Couleur {

    Noir ("Noir"),
    Blanc ("Blanc");

    private String name = "";

    // Constructeur
    Couleur(String name){
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

}

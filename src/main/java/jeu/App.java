package jeu;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Pseudo joueur 1 :");
        String pseudo1 = clavier.nextLine();
        System.out.println("Pseudo joueur 2 :");
        String pseudo2 = clavier.nextLine();
        Player[] players = {new Player(Couleur.Blanc, pseudo1), new Player(Couleur.Noir, pseudo2)};
        Scenario scenario = new Scenario(players);
        System.out.println(scenario);
    }

}

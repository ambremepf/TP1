/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package td.puissance.pkg4;
import java.util.Scanner;
/**
 *
 * @author ambre
 */
public class TDPuissance4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("entrez le nom du joueur 1");
        String nom;
        nom = sc.nextLine();
        joueur joueurun = new joueur();
        joueurun.joueur(nom);
        System.out.println("entrez le nom du joueur 2");
        String nomdeux;
        nomdeux = sc.nextLine();
        joueur joueurdeux = new joueur();
        joueurdeux.joueur(nomdeux);
        
        
        Partie part = new Partie (joueurun, joueurdeux);
        part.attribuerCouleursAuxJoueurs();
        part.initialiserPartie();
        part.debuterPartie();
    }
    
}

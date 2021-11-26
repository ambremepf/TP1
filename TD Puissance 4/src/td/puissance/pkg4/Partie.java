/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td.puissance.pkg4;
/**
 *
 * @author ambre
 */

import java.util.Scanner;
public class Partie {
    joueur[] listeJoueur = new joueur [2];
    joueur joueurCourant;
    Grille grilleJeu;
    
public Partie (joueur premierjoueur, joueur deuxiemejoueur){
   listeJoueur[0] = premierjoueur;
   listeJoueur[1] = deuxiemejoueur;
    
}
    
    /**
     *
     */
    public void attribuerCouleursAuxJoueurs(){
        listeJoueur[0].couleur= "jaune";
        listeJoueur[1].couleur = "rouge";
}
    
    public void initialiserPartie (){
        grilleJeu = new Grille();
        
        for (int i=0; i<=21; i++){
            Jeton jetonjoueur1 = new Jeton("jaune");
            Jeton jetonjoueur2 = new Jeton("rouge");
        }
        
    }
    public void debuterPartie(){
        joueurCourant = listeJoueur[0];
        while (grilleJeu.etreRemplie() == false || grilleJeu.etreGagnantePourJoueur(joueurCourant)!= true){
             System.out.println("c'est au tour de " + joueurCourant.nom);
             grilleJeu.afficherGrilleSurConsole();
             Scanner sc;
             sc = new Scanner(System.in);
             int coup;
             coup = 0;
             
             System.out.println("quelle colone voulez-vous jouer ?");
             coup = sc.nextInt();
             
             while (coup>7 || grilleJeu.colonneRemplie(coup)==true ){
                 System.out.println("quelle colone voulez-vous jouer ?");
                 coup = sc.nextInt();
             }
             Jeton j = joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];
             joueurCourant.nombreJetonsRestants--;
             
             grilleJeu.ajouterJetonDansColonne(j, coup);
             
             if (joueurCourant==listeJoueur[0]){
                 joueurCourant=listeJoueur[1];
             }
             else {
                 joueurCourant=listeJoueur[0];
             }
             if (grilleJeu.etreGagnantePourJoueur(joueurCourant)== true){
                 break;
             }
        }
    }

   
}

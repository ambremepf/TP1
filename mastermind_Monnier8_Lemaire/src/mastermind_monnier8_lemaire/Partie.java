/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_monnier8_lemaire;
import java.util.Random;
/**
 *
 * @author ambre
 */
public class Partie {
    Joueur[] listeJoueur = new Joueur [1];
    Joueur joueurCourant;
    Grille grilleJeu;
    Grille grilleordi;
    Jeton Couleur;
    

    
    public Partie (Joueur premier1){
        listeJoueur[0] = premier1;
    }
    public void initialiserpartie (){
        grilleJeu = new Grille();
        grilleordi.co
    
}
    public void debuterpartie(){
        String [] combinaison = new String[4];
        int j = 0;
        Random R = new Random();
        Couleur.listecouleur();
        for (int i=0; i<=4;i++){
            i =R.nextInt(Couleur.size());
        }
    }
}

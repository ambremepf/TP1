/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_monnier8_lemaire;
import java.util.ArrayList;
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
    ArrayList<String> listeCouleurs; 

    
    public Partie (Joueur premier1){
        listeJoueur[0] = premier1;
        
               
        listeCouleurs = new ArrayList<String>();
        listeCouleurs.add("vert");
        listeCouleurs.add("rouge");
        listeCouleurs.add("noir");
        listeCouleurs.add("bleu");
        listeCouleurs.add("jaune");
        listeCouleurs.add("blanc"); 
    }
    public void initialiserpartie (){
        grilleJeu = new Grille();
        grilleordi.ConstructeurOrdi();
    
}
    public void debuterpartie(){
        String [] combinaison = new String[4];
        int j = 0;
        Random R = new Random();
        for (int i=0; i<=4;i++){
            int k = 0;
            k =R.nextInt();
            combinaison[i]=listeCouleurs.get(k);
            
        }
    }
}

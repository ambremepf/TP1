/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td.puissance.pkg4;
/**
 *
 * @author ambre
 */
public class Partie {
    joueur listeJoueur1;
    joueur listeJoueur2;
    joueur joueurCourant;
    Grille grilleJeu;
    
public Partie (joueur premierjoueur, joueur deuxiemejoueur){
    listeJoueur1 = premierjoueur;
    listeJoueur2 = deuxiemejoueur;
    
}
    
    /**
     *
     * @return
     */
    public String attribuerCouleursAuxJoueurs(){
        listeJoueur1.affectercouleur = "jaune";
        listeJoueur2.affectercouleur = "rouge";
}
    
    public void initialiserPartie (){
        Grille grilleDeJeu = new Grille();
        
        for (int i=0; i<=21; i++){
            Jeton jetonjoueur1 = new Jeton("jaune");
            Jeton jetonjoueur2 = new Jeton("rouge");
        }
        
    }
}

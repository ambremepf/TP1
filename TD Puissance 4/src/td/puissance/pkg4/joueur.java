/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td.puissance.pkg4;
import java.util.Scanner;
/**
 *
 * @author ambre
 */
public class joueur {
    String nom;
    String couleur;
    int nombreDesintegrateurs;
    int nombreJetonsRestants;
    Jeton [] ListeJetons[];
    public void joueur(String j){
        nom = j ; 
    }

    /**
     *
     * @param c
     */
    public void affectercouleur(String c){
        couleur=c;
    }
    public void ajouterJeton(Jeton aj ){
        nombreJetonsRestants = nombreJetonsRestants + 1;
        for (int i = 0; i<=20; i++){
            if(ListeJetons[i] != null){
                ListeJetons[i]= Jeton aj;
                break;
            }
        }
    }
    public void obtenirDesintegrateur(){
        
    }
    public void utiliserDesintegrateur(){
        
    }
}

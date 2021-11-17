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
    int nombreDesintegrateurs=0;
    int nombreJetonsRestants=21;
    Jeton [] ListeJetons = new Jeton [21];
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
       if(nombreJetonsRestants < 21){
           ListeJetons[nombreJetonsRestants]=aj;
           nombreJetonsRestants = nombreJetonsRestants + 1;
       }
    }
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs=nombreDesintegrateurs+1;
        
    }
    public boolean utiliserDesintegrateur(){
        if (nombreDesintegrateurs==0){
            return false;
        }
        nombreDesintegrateurs=nombreDesintegrateurs-1;    
        return true;
    }
}

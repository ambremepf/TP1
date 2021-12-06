/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_monnier8_lemaire;

/**
 *
 * @author ambre
 */
public class Joueur {
    String nom;
    
    
    
    public void joueur(String j){
        nom = j ; 
    }

    /**
     *
     * @param c
     */
    
    public void ajouterJeton(Jeton aj ){
       if(nombreJetonsRestants < 21){
           ListeJetons[nombreJetonsRestants]=aj;
           nombreJetonsRestants = nombreJetonsRestants + 1;
       }
    }

}

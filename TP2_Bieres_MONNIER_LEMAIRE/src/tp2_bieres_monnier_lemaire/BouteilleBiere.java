/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_monnier_lemaire;

/**
 *
 * @author jeanl
 */

public class BouteilleBiere {
    // attributs :
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    // méthodes :
    public void lireEtiquette(){
        System.out.println("Bouteille de "+nom+" ("+ degreAlcool+" degres)\nBrasserie : "+brasserie);
        System.out.println("La bouteille est-elle ouverte? : "+ouverte);
    }

    /**
     *
     * @param unNom
     * @param unDegre
     * @param uneBrasserie
     */
    public BouteilleBiere(String unNom, float unDegre, String 
    uneBrasserie) { 
 
    nom = unNom; 
    degreAlcool = unDegre; 
    brasserie = uneBrasserie; 
    ouverte = false; 
}
    
    
    
    
    
    
    
}

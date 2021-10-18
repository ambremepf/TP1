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
    public void decapsuler(){
        if (ouverte==false){
            ouverte = true;
        }
        else {
            System.out.println("erreur : la bière est déjà ouverte ");
        }
                   
        }
    

    /**
     *
     * @param unNom
     * @param unDegre
     * @param uneBrasserie
     */
     public BouteilleBiere(String unNom, float unDegre, String uneBrasserie){

        nom = unNom;
        degreAlcool = unDegre; 
        brasserie = uneBrasserie; 
        ouverte = false; 
    }
     
     @Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_monnier8_lemaire;

import java.util.ArrayList;

/**
 *
 * @author ambre
 */
public class Jeton {
    int nbjeton=28;
    String couleur;
    
    
    public Jeton(String jet){
        couleur = jet;
    }
    public String lireCouleur(){
        return couleur;
    }
    Jeton [] ListeJetons = new Jeton [28];
    
    

    public void listecouleur(){
        ArrayList<String> Couleur;
        Couleur = new ArrayList<String>();
        Couleur.add("vert");
        Couleur.add("rouge");
        Couleur.add("noir");
        Couleur.add("bleu");
        Couleur.add("jaune");
        Couleur.add("blanc"); 
    
    }
    
}



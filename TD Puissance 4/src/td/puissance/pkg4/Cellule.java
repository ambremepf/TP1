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
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;


public void Cellule(){
    jetonCourant = null;
    trouNoir = false;
    desintegrateur = false;
}
public boolean affecterJeton(Jeton j){
    
    if (jetonCourant== null){
        return true;
        jetonCourant = j;   
    }
    else {
        return false;
        
    }
}
public String lireCouleurDuJeton(){
    if (jetonCourant != null){
        return Jeton.couleur;
    }
    else {
        String a;
        a = "vide";
        return a;
    }
}
}
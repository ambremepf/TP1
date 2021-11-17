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
    public boolean affecterJeton(Jeton jetonaffecté){

        if (jetonCourant== jetonaffecté){
            return false;    
        }
        else {
            jetonCourant=jetonaffecté;
            return true;

        }
    }
    public String lireCouleurDuJeton(){
        if (jetonCourant != null){
            return jetonCourant.couleur;
        }
        else {
            return ("vide");
        }
    }
}
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
    public Jeton recupererJeton(){
        return jetonCourant;
    }
    public boolean supprimerJeton(){
        jetonCourant=null;
        if (jetonCourant==null){
            return true;
        }
        return false;
    }
    public boolean placerTrouNoir (){
        if (trouNoir==false){
            trouNoir=true;
            return true;    
        }
        return false;
    }
    public boolean  placerDesintegrateur(){
        if (desintegrateur==false){
            desintegrateur=true;
            return true;    
        }
        return false;
    }
    public boolean presenceTrouNoir(){
        if (trouNoir==true){
            return true;
        }
        return false;
    }
    public boolean presenceDesintegrateur(){
        if (desintegrateur==true){
            return true;
        }
        return false;
    }
    public boolean recupererDesintegrateur(){
        if (desintegrateur==true){
            desintegrateur=false;
            return true;
        }
        return false;
    }
    
    public String lireCouleurDuJeton(){
        if (jetonCourant != null){
            return jetonCourant.couleur;
        }
        else {
            return ("vide");
        }
    }
    public boolean activerTrouNoir(){
        if (trouNoir==true){
            jetonCourant=null;
            trouNoir=false;
            
            
            return true;
        }else{
        return false;
        }
    }
}
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
public class Grille {
    Cellule[][]CellulesJeu = new Cellule[6][7];
    public void Grille(){
    for (int i=0;i<=6;i++){
        for(int j=0;j<=7;j++){
            CellulesJeu[i][j]=new Cellule();
        }
    }
    }
    public boolean ajouterJetonDansColonne(Jeton jetG,int j){
         
         for (int i = 0; i<= 5;i++){
             if (CellulesJeu[i][j].jetonCourant == null){
                 CellulesJeu[i][j].jetonCourant =jetG;
                 return true;
             }
         }
         return false;
         
    }
    public boolean etreRemplie(){
        for (int i=0;i<=6;i++){
            for(int j=0;j<=7;j++){
                if (CellulesJeu[i][j].jetonCourant == null){
                 return false;
                }
        }
        
        }
        return true;
    }
    public void viderGrille(){
        for (int i=0;i<=6;i++){
            for(int j=0;j<=7;j++){
                CellulesJeu[i][j]= null;
                 
            }
        }
        
    }
    public void afficherGrilleSurConsole(){
        for (int i=0;i<=6;i++){
            for(int j=0;j<=7;j++){ 
                if (CellulesJeu[i][j].lireCouleurDuJeton() ==null) {
                System.out.print("-");      
                } 
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "Rouge") {
                System.out.print("R");      
                }
                if (CellulesJeu[i][j].lireCouleurDuJeton() =="Jaune") {
                System.out.print("J");      
                }
    
      }  
    }
    }
    public boolean celluleOccupee(int i,int j){
       if (CellulesJeu[i][j].jetonCourant != null){
           return true;
         }
       return false;
    }
    public String lireCouleurDuJeton(int i, int j){
        return (CellulesJeu[i][j].lireCouleurDuJeton());    
    }
    public boolean etreGagnantePourJoueur(joueur J){
        String Jcouleur=J.couleur;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=3;j++){
                if (CellulesJeu[i][j].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i][j+1].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i][j+2].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i][j+3].lireCouleurDuJeton()==Jcouleur){
                    return true;
                }
            }
        }
        for(int i=0;i<=2;i++){
            for(int j=0;j<=6;j++){
                if (CellulesJeu[i][j].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i+1][j].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i+2][j].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i+3][j].lireCouleurDuJeton()==Jcouleur){
                    return true;
                }
            }
        }
        for(int i=0;i<=2;i++){
            for(int j=0;j<=3;j++){
                if (CellulesJeu[i][j].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i+1][j+1].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i+2][j+2].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i+3][j+3].lireCouleurDuJeton()==Jcouleur){
                    return true;
                }
            }
        }
        for(int i=5;i>=3;i--){
            for(int j=0;j<=3;j++){
                if (CellulesJeu[i][j].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i-1][j+1].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i-2][j+2].lireCouleurDuJeton()==Jcouleur && CellulesJeu[i-3][j+3].lireCouleurDuJeton()==Jcouleur){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean colonneRemplie(int j){
        
        for (int i=0;i<=6;i++){
            if (CellulesJeu[i][j].jetonCourant == null){
             return false;
            }
        }
        return true;
    }
        
}


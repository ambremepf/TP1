/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_monnier8_lemaire;

/**
 *
 * @author ambre
 */
public class Grille {
    Cellule[][]CellulesJeu = new Cellule[12][4];
    public Grille(){
    for (int i=11;i>=0;i--){
        for(int j=0;j<=3;j++){
            CellulesJeu[i][j]=new Cellule();
        }
    }
    }
    public boolean ajouterJetonDansColonne(Jeton jetG,int numCol){
         
         for (int j = 0; j<= 5;j++){
            
             if (CellulesJeu[j][numCol].jetonCourant == null){
                 CellulesJeu[j][numCol].jetonCourant =jetG;
                 return true;
             }
         }
         return false;
         
    }
}

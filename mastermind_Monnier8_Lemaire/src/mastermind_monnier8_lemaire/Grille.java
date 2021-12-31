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
    String [] grilledejeu;
    
    public void grille(){
    String [] grilledejeu = new String [4];
    }
    
       
    
    
    public void ConstructeurOrdi(){
        String [] jeuordi = new String [4];
        
        }
    
        
    
        
    
    public boolean ajouterJetonDansColonne(String couleur){
         
         for (int j = 0; j<=3;j++){
             if (grilledejeu[j] == " "){
                 grilledejeu[j] = couleur;
                 return true;
             }
             
         }
        return false;
               
    }
}

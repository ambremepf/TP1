/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_monnier8_lemaire;

import java.util.Arrays;

/**
 *
 * @author ambre
 */
public class Grille {
    //String [] grilledejeu;
    String [] grilledejeu = new String [4];
    public void grille(){
    String [] grilledejeu = new String [4];
    }
    
       
    
    
        
    
        
    
    
    
    public int[] vérification(String []grilleordi,String[] grilledejeu){
        int nbdepionbienplacé=0;    
        int nbdepionayantlamemecouleur=0;
        int [] monResultat = {nbdepionbienplacé, nbdepionayantlamemecouleur};
        for (int e=0; e<=3; e++){
            for (int o=0; o<=3; o++){
                if (grilleordi[e]==grilledejeu[o]){
                    nbdepionayantlamemecouleur=nbdepionayantlamemecouleur+1;
                }
            }
            if (grilleordi[e]==grilledejeu[e]){
                nbdepionbienplacé=nbdepionbienplacé+1;
            }
        }
        return monResultat;  
    }
        
 public void affichergrille(){
     System.out.println(Arrays.toString(grilledejeu));
 }
}

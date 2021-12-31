/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_monnier8_lemaire;

/**
 *
 * @author ambre
 */
public class Verification{
    int nbdepionbienplacé=0;    
    public void vérificationpion(String [] grillejeu,String []grilleordi){
        for (int j=0;j<=3;j++){
            if(grilleordi[j]==grillejeu[j]){
             nbdepionbienplacé=nbdepionbienplacé+1;
             for ()
             grilleordi[j]=grilleordi[j+1];
             
            }
        }
        
}
}

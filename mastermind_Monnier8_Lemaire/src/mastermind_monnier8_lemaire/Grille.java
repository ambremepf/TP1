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
    int nbdepionbienplacé=0;    
    int nbdepionayantlamemecouleur=0;
    int tailletableau=4;
    public int vérification(String []grilleordi){
        for (int j=0;j<=3;j++){
            Grille grilleordiv = null;
            grilleordiv.grille();
            
            if(grilleordi[j]==grilledejeu[j]){
             nbdepionbienplacé=nbdepionbienplacé+1;
             for (int a=j;a<=tailletableau-2;a++){
             grilleordi[a]=grilleordi[a+1];
             grilledejeu[a]=grilledejeu[a+1];
             }
             tailletableau=tailletableau-1;
            }    
        }
        for (int j=0;j<tailletableau;j++){
            for(int a=0;a<tailletableau;a++){
                if(grilleordi[j]==grilledejeu[a]){
                    for (int b=a;b<tailletableau-2;b++){
                    grilledejeu[b]=grilledejeu[b+1];
                    }
                    for (int c=j;c<tailletableau-2;c++){
                    grilledejeu[c]=grilledejeu[c+1];
                    }
                }
                
                     
                } 
            }
    }
        
        
}

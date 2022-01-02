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
    
    public int[] vérification(String []grilleordi){
        int nbdepionbienplacé=0;    
        int nbdepionayantlamemecouleur=0;
        int tailletableau=4;
        int[] monResultat={nbdepionbienplacé,nbdepionayantlamemecouleur};
        String [] grilleordicopie= new String[4];
        String [] grilledejeucopie= new String[4];
        for(int e=0;e<4;e++){
            grilleordicopie[e]=grilleordi[e];
            grilledejeucopie[e]=grilledejeu[e];
        }
        for (int j=0;j<=tailletableau-1;j++){
            if(grilleordicopie[j]==grilledejeucopie[j]){
             nbdepionbienplacé=nbdepionbienplacé+1;
             for (int a=j;a<=tailletableau-2;a++){
             grilleordicopie[a]=grilleordicopie[a+1];
             grilledejeucopie[a]=grilledejeucopie[a+1];
             }
             tailletableau=tailletableau-1;
            }
        
        }
        for (int j=0;j<tailletableau;j++){
            for(int a=0;a<tailletableau;a++){
                if(grilleordicopie[j]==grilledejeucopie[a]){
                    for (int b=a;b<tailletableau-2;b++){
                    grilledejeucopie[b]=grilledejeucopie[b+1];
                    }
                    for (int c=j;c<tailletableau-2;c++){
                    grilleordicopie[c]=grilleordicopie[c+1];
                    }
                    nbdepionayantlamemecouleur=nbdepionayantlamemecouleur+1;
                    tailletableau=tailletableau-1;
                }    
                }
            
        }
        return monResultat;  
    }
        
        
}

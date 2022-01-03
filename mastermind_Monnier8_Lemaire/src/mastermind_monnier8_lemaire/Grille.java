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
    
       
    
    
        /*fejev
    vekovkoe
            evkoekv
            veokv
        */
    
        
    
    
    
    public int[] vérification(String []grilleordi,String[] grilledejeu){
        int nbdepionbienplacé=0;    
        int nbdepionayantlamemecouleur=0;
        int tailletableau=4;
        
        String [] grilleordicopie= new String[4];
        String [] grilledejeucopie= new String[4];
        for(int e=0;e<4;e++){
            grilleordicopie[e]=grilleordi[e];
            grilledejeucopie[e]=grilledejeu[e];
        }
        System.out.println(Arrays.toString(grilleordicopie));
        System.out.println(Arrays.toString(grilledejeucopie));
        System.out.println(Arrays.toString(grilleordi));
        System.out.println(Arrays.toString(grilledejeu));
        System.out.println(grilleordicopie[0]);
        System.out.println(grilledejeucopie[0]);
        System.out.println(grilleordicopie[1]);
        System.out.println(grilledejeucopie[1]);
        System.out.println(grilleordicopie[2]);
        System.out.println(grilledejeucopie[2]);
        System.out.println(grilleordicopie[3]);
        System.out.println(grilledejeucopie[3]);
        for (int j=0;j<=tailletableau-1;j++){
            if(grilleordicopie[j] == null ? grilledejeucopie[j] == null : grilleordicopie[j].equals(grilledejeucopie[j])){
             nbdepionbienplacé=nbdepionbienplacé+1;
             System.out.println(nbdepionbienplacé);
             for (int a=j;a<=tailletableau-2;a++){
             grilleordicopie[a]=grilleordicopie[a+1];
             grilledejeucopie[a]=grilledejeucopie[a+1];
             }
             tailletableau=tailletableau-1;
            }
        
        }
        for (int j=0;j<tailletableau;j++){
            for(int a=0;a<tailletableau;a++){
                if(grilleordicopie[j] == null ? grilledejeucopie[a] == null : grilleordicopie[j].equals(grilledejeucopie[a])){
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
        int[] monResultat={nbdepionbienplacé,nbdepionayantlamemecouleur};
        System.out.println(Arrays.toString(monResultat));
        return monResultat;
        
    }
    /*public int[] vérification(String []grilleordi,String[] grilledejeu){
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
    }*/
        
 public void affichergrille(){
     System.out.println(Arrays.toString(grilledejeu));
 }
}

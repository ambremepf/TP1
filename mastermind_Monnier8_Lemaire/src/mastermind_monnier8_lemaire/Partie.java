/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_monnier8_lemaire;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ambre
 */
public class Partie {
    
    
    
    public Partie (){
              
        
    }
    public void initialiserpartie (){
        
        
        
    
}
//     Grille grilledeJeu;
//    public Partie (){
              
        
//    }
//    public void initialiserpartie (){
        
//        Grille grilleDejeu = new Grille();
        
    
//}
    
    public void debuterpartie(){
        //Grille grilledejeu = new Grille();
        String [] grilledejeu = new String [4];
        String [] listeCouleurs = new String [6];
        listeCouleurs [0] = "\u001B[32m 0 ";
        listeCouleurs [1] = "\u001B[31m 0 ";
        listeCouleurs [2] = "0";
        listeCouleurs [3] = "\u001B[34m 0 ";
        listeCouleurs [4] = "\u001B[33m 0 ";
        listeCouleurs [5] = "\u001B[37m 0 "; 
        String [] combinaison = new String[4];
        Random R = new Random();
        for (int i=0; i<=3;i++){
            int k;
            k =R.nextInt(6);
            combinaison[i] = listeCouleurs[k];
        }
        int i =1;
        int [] resultat = new int [2];
        int nbdepiontbienplacé=0;
        int bonnecouleur;
        String [][] affichagegrille = new String [10][12];
        for (int y=0; y<=11; y++){
            affichagegrille[2][y] = "|";
            affichagegrille[7][y] = "|";
            for (int k=0; k<=1; k++){
                affichagegrille[k][y] = "*";
            }
            for (int ze=8; ze<=9; ze++){
                affichagegrille[ze][y]="*";
            }
        }
        while (i!=12 && nbdepiontbienplacé  != 4){
            for(int j=1;j<=4;j++){
               
            System.out.println("choisissez la couleur (jaune, rouge, vert, noir, blanc, bleu) pour la "+j+" cases");
            Scanner sc;
            sc = new Scanner(System.in);
            String choix;
            choix = sc.next();
            
            while (!"jaune".equals(choix) && !"rouge".equals(choix) && !"noir".equals(choix) && !"bleu".equals(choix) && !"vert".equals(choix) && !"blanc".equals(choix)){
                System.out.println("choisissez la couleur (jaune, rouge, vert, noir, blanc, bleu) pour la "+j+" cases");
                 sc = new Scanner(System.in);
                 choix = sc.next();
            }
            int choixint=0;
            if ("vert".equals(choix)){
                choixint = 0;
            }
            if ("rouge".equals(choix)){
                choixint =1;
            }
            if ("noir".equals(choix)){
                choixint =2;
            }
            if ("bleu".equals(choix)){
                choixint =3;
            }
            if ("jaune".equals(choix)){
                choixint =4;
            }
            if ("blanc".equals(choix)){
                choixint =5;
            }
           
             //if (grilledejeu[j] == ""){
                 grilledejeu[j-1] = listeCouleurs[choixint];
                 
                 
             //}
             }
         
            
            //String grillejeu[]=grilledejeu.ajouterJetonDansColonne(choix);
            
        
        Grille utilitaire = new Grille();
        resultat = utilitaire.vérification(combinaison, grilledejeu);
        nbdepiontbienplacé = (int) resultat[0];
        bonnecouleur = (int) resultat[1];
        System.out.println("vous avez "+nbdepiontbienplacé+" pions bien placés et "+bonnecouleur+" pions de la bonne couleur.");
        for (int aff=3; aff<=6; aff++){
            affichagegrille[aff][i-1] = grilledejeu[aff-3];
        }
        if (nbdepiontbienplacé == 1){
            affichagegrille [0][i-1] = "\u001B[37m 0 ";
            }
        if (nbdepiontbienplacé ==2){
            affichagegrille [0][i-1] = "\u001B[37m 0";
            affichagegrille [1][i-1] = "\u001B[37m 0";
        }
        if (nbdepiontbienplacé == 3){
            affichagegrille [0][i-1] = "\u001B[37m 0 ";
            affichagegrille [1][i-1] = "\u001B[37m 0 ";
            affichagegrille [8][i-1] = "\u001B[37m 0 ";
        }
        if (nbdepiontbienplacé == 4){
            affichagegrille [0][i-1] = "\u001B[37m 0 ";
            affichagegrille [1][i-1] = "\u001B[37m 0";
            affichagegrille [8][i-1] = "\u001B[37m 0 ";
            affichagegrille [9][i-1] = "\u001B[37m 0";
        }
        
        
             if(bonnecouleur == 1 ){
                 for (int ver=0; ver<=9;ver++){
                 if("*".equals(affichagegrille [ver][i-1])){
                    affichagegrille [ver][i-1] = "\u001B[31m 0 ";
                    break;
                 }
                 }
        }
             if(bonnecouleur == 2 ){
                 for(int rep=0; rep<=1; rep++)
                 for (int ver=0; ver<=9;ver++){
                 if("*".equals(affichagegrille [ver][i-1])){
                affichagegrille [ver][i-1] = "\u001B[31m 0 ";
                break;
                 }
                 }
             }
                 
                 
             if(bonnecouleur == 3 ){
                 for (int rep=0; rep<=2; rep++){
                for (int ver=0; ver<=9;ver++){
                if("*".equals(affichagegrille [ver][i-1])){
                 affichagegrille [ver][i-1] = "\u001B[31m 0 ";
                 break;
                 }
                 }
                 }
                
        }
             if(bonnecouleur == 4 ){
                 for (int rep=0; rep<=3; rep++){
                for (int ver=0; ver<=9;ver++){
                if("*".equals(affichagegrille [ver][i-1])){
                 affichagegrille [ver][i-1] = "\u001B[31m 0 ";
                 break;
                 }
                 }
                 }
             }
        
       
        for (int ligne=0; ligne<=11;ligne++){
            System.out.println(" ");
            for(int affichage=0; affichage<=9; affichage++){
            System.out.print(affichagegrille[affichage][ligne]+" ");
         
        }
        }
        System.out.println(" ");
        i++;
        }
        
      if (nbdepiontbienplacé != 4){
          System.out.println("vous avez perdu !");
      }else{
          System.out.println("vous avez gagné !");
      }
}
}

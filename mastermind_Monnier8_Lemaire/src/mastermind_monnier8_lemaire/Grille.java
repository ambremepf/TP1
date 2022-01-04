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
    String [] grilledejeu = new String [4]; // Initialisation de la grille du joueur
    public void grille(){
    String [] grilledejeu = new String [4];//constructeur de la grille du joueur
    }
    
       
    
    
        /*fejev
    vekovkoe
            evkoekv
            veokv
        */
    
        
    
    
    
    public int[] vérification(String []grilleordi,String[] grilledejeu){ // creation de la methode vérification avec en entré 
        //les 2 grilles, joueur et ordi et en retour un tableau de 2 entier qui sont le nb de pion bien placé et le nb de pion avec la bonne couleur mais pas bien placé
        int nbdepionbienplacé=0;    //initialisation des variables
        int nbdepionayantlamemecouleur=0;
        int tailletableau=4;
        
        String [] grilleordicopie= new String[4]; //initialisation des deux tableaux copie qui seront les copies des deux tableaux d'entrés pour nous permettre de changer les valeurs dans les tableaux sans changer les tableaux initiaux
        String [] grilledejeucopie= new String[4];
        for(int e=0;e<4;e++){ //boucle qui sert à copier les deux tableaux d'entrés, donc à attribuer à chaque case la valeur de la meme case mais qui se trouve dans les tableaux d'entré
            grilleordicopie[e]=grilleordi[e];//copie des tableau d'entré 
            grilledejeucopie[e]=grilledejeu[e];
        }
        /*System.out.println(Arrays.toString(grilleordicopie)); //prints pour vérifier notre code
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
        System.out.println(grilledejeucopie[3]);*/
        for (int j=0;j<=tailletableau-1;j++){ // boucle qui sert à verifier si il y a des pions avec la même couleur et qui sont bien placés
            if(grilleordicopie[j] == grilledejeucopie[j]){ // verification de l'egalité des valeurs des cases si c'est egal alors on entre dans la condition sinon on passe la condition
             nbdepionbienplacé=nbdepionbienplacé+1;//variable nb de pion bien placé prend plus 1 
             //System.out.println(nbdepionbienplacé);// on l'affichait pour pouvoir vérifier notre code à certains endroit particuliers
             /*for (int a=j;a<=tailletableau-2;a++){ // essai de code on voulait supprimer les cases qui etaient identique entre les deux tableaux mais cela ne marché pas on a donc cherché untre autre methode
             grilleordicopie[a]=grilleordicopie[a+1];
             grilledejeucopie[a]=grilledejeucopie[a+1];
             }
             tailletableau=tailletableau-1;*/
             grilleordicopie[j]="verif"; // l'autre methode que l'on a trouvé c'est de changer les valeurs des deux tableaux pour qu'elles soit différente entre elle est 
             grilledejeucopie[j]="verif1";//qu'elles ne correspondent pas à des couleurs du jeu pour que ces cases ne puissent correspondrent à aucune des conditions du code
            
             /*System.out.println(Arrays.toString(grilleordicopie));// affichage pour verification du code
             System.out.println(Arrays.toString(grilledejeucopie));*/
            }
        
        }
      
        for (int j=0;j<tailletableau;j++){//boucle qui permet d'identifier le nombre de bonnes couleurs correspondantes entre les deux grilles mais qui ne sont pas bien placé
            for(int a=0;a<tailletableau;a++){
                if(grilleordicopie[j]==grilledejeucopie[a]){//condition si les deux cases sont égale alors on rentre dans la condition
                    /*for (int b=a;b<tailletableau-1;b++){//methode qui supprimer les cases du tableau pour de pas avoir de redondances aux niveau du nb de mêmes couleurs 
                    grilledejeucopie[b]=grilledejeucopie[b+1];//et donc la taille du tableau se réduisé mais nous avons pas réussie à la faire marcher
                    }
                    for (int c=j;c<tailletableau-1;c++){
                    grilleordicopie[c]=grilleordicopie[c+1];
                    }*/
                    grilleordicopie[j]="coulverif";//attribution de différente valeurs aux deux cases du même styleque la boucle au dessus
                    grilledejeucopie[a]="coulverif1";
                    nbdepionayantlamemecouleur=nbdepionayantlamemecouleur+1;//variable plus 1 du coup si la condition est vérifier
                    //tailletableau=tailletableau-1;
                    /*System.out.println(Arrays.toString(grilleordicopie));//affichage pour vérifier le code
                    System.out.println(Arrays.toString(grilledejeucopie));*/
                }
                
                }
            
        }
        
        int[] monResultat={nbdepionbienplacé,nbdepionayantlamemecouleur};//initialisation du tableau resultat qui prend les valeurs finals du nb de bonne couleurs mais pas avec le bon placement et du nb de pions bien placé 
        //System.out.println(Arrays.toString(monResultat)); //affichage pour vérifier le code
        return monResultat;// on retourne le tableau final du code effectué
        
    }
    /*public int[] vérification(String []grilleordi,String[] grilledejeu){//autre essai de methode de vérification qui ne marché que pour la condition de la position identique
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
        
 /*public void affichergrille(){
     System.out.println(Arrays.toString(grilledejeu));
 }*/

/*public void affichergrille(){ // essai de methode d'affichage mais ce n'etait pas pratique de la mettre dans la classe grille
        for (int i=5;i>=0;i--){
            for(int j=0;j<=6;j++){
                
                    if ("rouge".equals(grilledejeu[j])) {
                    System.out.print(" \033[31m X \033[30m ");      
                    }
                    else if ("jaune".equals(grilledejeu[j])) {
                    System.out.print(" \033[33m X \033[30m ");      
                    }
            
                else  {
                System.out.print(" ");      
                } } 
                
        
      }  System.out.println();
      System.out.println(Arrays.toString(grilledejeu));
    }*/
}
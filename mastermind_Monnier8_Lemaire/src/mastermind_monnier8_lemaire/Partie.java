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

    public void debuterpartie(){
        //Grille grilledejeu = new Grille();
        String [] grilledejeu = new String [4];
        String [] listeCouleurs = new String [6]; // on crée une banque de couleur
        listeCouleurs [0] = "\u001B[32m 0 ";
        listeCouleurs [1] = "\u001B[31m 0 ";
        listeCouleurs [2] = "\u001B[30m 0 ";
        listeCouleurs [3] = "\u001B[34m 0 ";
        listeCouleurs [4] = "\u001B[33m 0 ";
        listeCouleurs [5] = "\u001B[37m 0 "; 
        String [] combinaison = new String[4];
        Random R = new Random();
        for (int i=0; i<=3;i++){ // cette boucle permet de créer aléatoirement la solution gagnante
            int k;
            k =R.nextInt(6);
            combinaison[i] = listeCouleurs[k];
        }
        int i =1;
        int [] resultat = new int [2]; // cette liste nous permet de récupérer les résultats de la méthode vérification
        int nbdepiontbienplacé=0;
        int bonnecouleur;
        String [][] affichagegrille = new String [14][12]; // cela nous permettra par la suite d'afficher la grille du joueur 
        for (int y=0; y<=11; y++){ // toute cette partie met en place la grille d'affichage
            affichagegrille[4][y] = "\u001B[30m |";
            affichagegrille[9][y] = "\u001B[30m |";
            for (int k=0; k<=3; k++){
                affichagegrille[k][y] = "\u001B[30m *";
            }
            for (int ze=10; ze<=13; ze++){
                affichagegrille[ze][y]="\u001B[30m*";
            }
        }
        while (i!=13 && nbdepiontbienplacé  != 4){ // c'est ici le début réel de la partie avec les conditions de sortie
            for(int j=1;j<=4;j++){ // on demande au joueur de créer sa combinaison pour chaque tour
               
            System.out.println("choisissez la couleur (jaune, rouge, vert, noir, blanc, bleu) pour la "+j+" cases");
            Scanner sc;
            sc = new Scanner(System.in);
            String choix;
            choix = sc.next();
            
            while (!"jaune".equals(choix) && !"rouge".equals(choix) && !"noir".equals(choix) && !"bleu".equals(choix) && !"vert".equals(choix) && !"blanc".equals(choix)){
                System.out.println("choisissez la couleur (jaune, rouge, vert, violet, blanc, bleu) pour la "+j+" cases");
                 sc = new Scanner(System.in);
                 choix = sc.next();
            } // la boucle while permet au joueur de remettre une couleur s'il s'est trompé dans la saisi
            int choixint=0; // toutes les conditions if permettent d'aller chercher la couleur dans la banque de couleur créer au pré-alabe 
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
            
        
        Grille utilitaire = new Grille(); // on créer cet outil pour pouvoir utiliser la méthode vérification
        resultat = utilitaire.vérification(combinaison, grilledejeu);//on attribut a resultat la valeur retour de la methode vérification dans grille
        nbdepiontbienplacé = (int) resultat[0];//on recupère les valeurs des deux cases du tableau pour les attribuer au variable
        bonnecouleur = (int) resultat[1];
        System.out.println("vous avez "+nbdepiontbienplacé+" pions bien placés et "+bonnecouleur+" pions de la bonne couleur.");
        for (int aff=5; aff<=8; aff++){ // on met la grille du joueur dans la grille que nous allons afficher
            affichagegrille[aff][i-1] = grilledejeu[aff-5];
        }
        if (nbdepiontbienplacé == 1){ // ces conditions permettent de renvoyer et d'afficher le résultat au joueur avec les couleurs correspondantes
            affichagegrille [0][i-1] = "\u001B[37m 0 ";
            }
        if (nbdepiontbienplacé ==2){
            affichagegrille [0][i-1] = "\u001B[37m 0";
            affichagegrille [1][i-1] = "\u001B[37m 0";
        }
        if (nbdepiontbienplacé == 3){
            affichagegrille [0][i-1] = "\u001B[37m 0 ";
            affichagegrille [1][i-1] = "\u001B[37m 0 ";
            affichagegrille [2][i-1] = "\u001B[37m 0 ";
        }
        if (nbdepiontbienplacé == 4){
            affichagegrille [0][i-1] = "\u001B[37m 0 ";
            affichagegrille [1][i-1] = "\u001B[37m 0";
            affichagegrille [2][i-1] = "\u001B[37m 0 ";
            affichagegrille [3][i-1] = "\u001B[37m 0";
        }
        
        
             if(bonnecouleur == 1 ){
                affichagegrille [10][i-1] = "\u001B[31m 0 ";
                
        }
             if(bonnecouleur == 2 ){
                 affichagegrille [10][i-1] = "\u001B[31m 0 ";
                 affichagegrille [11][i-1] = "\u001B[31m 0 ";
             }
                 
                 
             if(bonnecouleur == 3 ){
                affichagegrille [10][i-1] = "\u001B[31m 0 ";
                affichagegrille [11][i-1] = "\u001B[31m 0 ";
                affichagegrille [12][i-1] = "\u001B[31m 0 ";
                
        }
             if(bonnecouleur == 4 ){
                 affichagegrille [10][i-1] = "\u001B[31m 0 ";
                 affichagegrille [11][i-1] = "\u001B[31m 0 ";
                 affichagegrille [12][i-1] = "\u001B[31m 0 ";
                 affichagegrille [13][i-1] = "\u001B[31m 0 ";
             }
        
       System.out.println("\n bonne place                      bonne couleur");//nom des differentes colonnes de vérification
        for (int ligne=0; ligne<=11;ligne++){ // boucle qui permet d'afficher la grille au joueur
            System.out.println(" ");
            for(int affichage=0; affichage<=13; affichage++){
            System.out.print(affichagegrille[affichage][ligne]+" ");
         
        }
        }
        System.out.println(" ");
        i++; // incrémentation (numéro du tour)
        }
        
      if (nbdepiontbienplacé != 4){ // affichage de l'état de la partie lorsque l'on sort de la boucle while
          System.out.println("vous avez perdu ! :(");
      }else{
          System.out.println("vous avez gagné en "+(i-1)+" tours! :)");
      }
}
}

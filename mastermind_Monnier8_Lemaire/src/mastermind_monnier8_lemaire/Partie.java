/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_monnier8_lemaire;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ambre
 */
public class Partie {
    Grille grilleordi;
    ArrayList<String> listeCouleurs; 
    Grille grilleJeu;
    public Partie (){
               
        listeCouleurs = new ArrayList<>();
        listeCouleurs.add("vert");
        listeCouleurs.add("rouge");
        listeCouleurs.add("noir");
        listeCouleurs.add("bleu");
        listeCouleurs.add("jaune");
        listeCouleurs.add("blanc"); 
    }
    public void initialiserpartie (){
        grilleordi.ConstructeurOrdi();
        grilleJeu.grille();
        
    
}
    public void debuterpartie(){
        String [] combinaison = new String[4];
        Random R = new Random();
        for (int i=0; i<=4;i++){
            int k = 0;
            k =R.nextInt();
            combinaison[i]=listeCouleurs.get(k);
        }
        int i =1;
        int nbdepiontbienplacé = 0;
        while (i!=12 || nbdepiontbienplacé == 4){
            for(int j=1;j<=4;j++){
               
            System.out.println("choisissez la couleur (jaune, rouge, vert, noir, blanc, bleu) pour la "+j+" cases");
            Scanner sc;
            sc = new Scanner(System.in);
            String choix;
            choix = sc.next();
            
            while (choix != "jaune" || choix != "rouge" || choix != "noir" || choix != "bleu" || choix != "vert" || choix !="blance"){
                System.out.println("choisissez la couleur (jaune, rouge, vert, noir, blanc, bleu) pour la "+j+"cases");
                 sc = new Scanner(System.in);
                 choix = sc.next();
            }
            grilleJeu.ajouterJetonDansColonne(choix);
        }
        
        nbdepiontbienplacé = grilleJeu.vérificationpion(combinaison);
        System.out.println("vous avez "+nbdepiontbienplacé+" pions bien placés");
            
        
    }
      System.out.println("vous avez perdu !");
}
}
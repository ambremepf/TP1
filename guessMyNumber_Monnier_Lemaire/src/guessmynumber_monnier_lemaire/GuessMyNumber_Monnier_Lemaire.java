/*
guessMyNumber/MOnnier Ambre et Lemaire Jean/ 07/10/2021
 */
package guessmynumber_monnier_lemaire;

import java.util.Random;
import java.util.Scanner;
public class GuessMyNumber_Monnier_Lemaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
     Random generateurAleat = new Random();
     int rep = 0;
     int n = generateurAleat.nextInt(100);
     int i = 0;
     Scanner saisieUtilisateur = new Scanner(System.in);
     
     System.out.println("quel niveau voules-vous jouer ? (1, 2 ou 3)");

     int niv= saisieUtilisateur.nextInt();
     
     if (niv == 1){
         while (rep != n){
        System.out.println("Veuillez entrer un nombre : ");
        int reputilisateur = saisieUtilisateur.nextInt();
        rep = reputilisateur;
        i=i+1;
        if (rep < n){
            System.out.println("plus grand");
        }
        else {
            System.out.println("plus petit");
        }
        System.out.println("bonne réponse !");
        System.out.println("vous avez mis "+i+" tours");
     }
     }
     if (niv == 2){
         while(rep!=n){
         System.out.println("Veuillez entrer un nombre : ");
         int reputilisateur = saisieUtilisateur.nextInt();
         rep = reputilisateur;
         i=i+1; 
        if (rep < n){
            System.out.println("plus grand");
        }
        else {
            System.out.println("plus petit");
        }
        }
        if (i<=20){
            System.out.println("vous avez gagné !!");
            System.out.println("vous avez mis "+i+" tours");
        }
        else {
            System.out.println("vous aves fait plus de 20 tours, vous avez perdu");
        }
     }
     
    }

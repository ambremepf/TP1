/*
 * Monnier Ambre et Lemaire Jean, TDA2, TP1, 04/10/2021
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author ambre
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner reader = new Scanner(System.in);  // Reading from System.in
     System.out.println("Entrer un entier: ");
     int nb1 = reader.nextInt();
     System.out.println("Entrer un entier: ");
     int nb2 = reader.nextInt();
     
    System.out.println("somme du nombre 1 et du nombre 2 : "+(nb1+nb2));
    System.out.println("différence du nombre 1 et du nombre 2 : "+(nb1-nb2));
    System.out.println("produit du nombre 1 et du nombre 2 : "+(nb1*nb2));
     int quotient=nb1/nb2;
     int reste=nb1%nb2;
     System.out.println("le quotient entier de la division nb1 par nb2 est: "+quotient+" et le reste de cette division est "+reste );
    
    
    }
    
}

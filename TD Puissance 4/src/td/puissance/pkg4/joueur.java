/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package td.puissance.pkg4;
import java.util.Scanner;
/**
 *
 * @author ambre
 */
public class joueur {
    String nom;
    String couleur;
    int nombreDesintegrateurs;
    int nombreJetonsRestants;
    Jeton [] ListeJetons;
    public void joueur(String NomJ1){
        nom = NomJ1 ; 
    }
    public void couleur(String couleurJ1){
        couleur=couleurJ1;
    }
    
}

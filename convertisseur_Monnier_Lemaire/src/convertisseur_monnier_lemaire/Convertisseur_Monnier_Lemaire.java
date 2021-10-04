/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_monnier_lemaire;
import java.util.Scanner;
/**
 *
 * @author jeanl
 */
public class Convertisseur_Monnier_Lemaire {

    /**
     * @param args the command line arguments
     */
    public float CelsiusVersKelvin(float tempCelsius){
        float tempKelvin;
        tempKelvin = tempCelsius + 275;
        return tempKelvin;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
     System.out.println("Entrer votre température: ");
     float nb1 = reader.nextFloat();
     
     CelsiusVersKelvin(nb1);
     
     
     
     
    }
    
}

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
     * @param tempCelsius result
     * @return 
     */
    public float CelsiusVersKelvin(float tempCelsius){
        float tempKelvin;
        tempKelvin = tempCelsius + 275;
        return tempKelvin;
    }
    public static float main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Bonjour, saisissez une valeur : ");
        float nb1 = reader.nextFloat();
        System.out.println("saisissez la conversion que vous souhaitez effectuer :");
        return nb1;
    }
    public float KelvinVersCelcius (float tempKelvin){
        float tempCelcius;
        tempCelcius=tempKelvin-275;
        return tempCelcius;
    }
    public float FarenheitVersCelcius( float tempFarenheit){
        float tempCelcius;
        tempCelcius=(32*tempFarenheit-32)*(5/9);
        return tempCelcius;
    }
    
    public float CelciusVersFarenheit (float tempCelcius){
        float tempFarenheit;
        tempFarenheit = (tempCelcius*(9/5))+32;
        return tempFarenheit;
    }
    
    /**
     *
     * @param tempKelvin
     * @return
     */
    public double KelvinVersFarenheit(float tempKelvin){
        double tempFarenheit;
        tempFarenheit = (tempKelvin*1.8)-459.67;
        return tempFarenheit;
    }
    // nous sommes passé à des variables de type double car le deboger a trouvé un problème avec le type float.
    
    /**
     *
     * @param tempFarenheit
     * @return
     */
    public double FarenheitVersKelvin(double tempFarenheit){
        double tempKelvin;
        tempKelvin = (tempFarenheit+459.67)/1.8;
        return tempKelvin;
    }
     double result =FarenheitVersKelvin(5.0);
     
     
     
     
}

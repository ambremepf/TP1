/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stats_monnier_lemaire2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ambre
 */
public class Stats_Monnier_Lemaire2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float [] tabEntiers = new float[6];
     for (int i=0;i<6;i++){
        tabEntiers[i]=0;
     }
     Scanner reader = new Scanner(System.in);  // Reading from System.in
     System.out.println("Entrer un entier: ");
     int m = reader.nextInt();
     for (int j=1;j<=m;j++){
      Random aleatoire =new Random();
      int n = aleatoire.nextInt(5);
      if (n==0){
         tabEntiers[0]=tabEntiers[0]+1;    
      }
      if (n==1){
         tabEntiers[1]=tabEntiers[1]+1;    
      }
      if (n==2){
         tabEntiers[2]=tabEntiers[2]+1;    
      }
      if (n==3){
         tabEntiers[3]=tabEntiers[3]+1;    
      } 
      if (n==4){
         tabEntiers[4]=tabEntiers[4]+1;    
      }
      if (n==5){
         tabEntiers[5]=tabEntiers[5]+1;    
      }
     }
     for(int i=0;i<6;i++){
     System.out.println(tabEntiers[i]);  
     }
     for(int i=0;i<6;i++){
     System.out.println(((tabEntiers[i])/m)*100+"%");  
     }
    }
    }
    


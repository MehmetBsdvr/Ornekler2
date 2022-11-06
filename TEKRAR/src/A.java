
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int vize,fınal;
        double ortalama;
        
        System.out.println("Vize Notunuzu giriniz");
        int x=input.nextInt();
        
        
        System.out.println("Final Notunuzu giriniz");
        int y=input.nextInt();
        
        ortalama=x*0.4+y*0.6;
        
        if(ortalama>=50 && y>=50){
            String durum = "Geçti";
        }
        else{
            String durum = "Kaldı";
        }
        System.out.println("Ortalama : " + ortalama);
        String ortalam;
        String durum = null;
        
        System.out.println("Durumunuz: " + durum);
        
    }

}

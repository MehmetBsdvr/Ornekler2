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
public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        int sayı,sayac=1;
        System.out.println("Lütfen bir sayıgiriniz");
        sayı=input.nextInt();
        while(sayı>9){
            sayı=sayı/10;
            sayac=sayac+1;
        }
        System.out.println("Basamak sayısı: "+sayac);


    }
    
}

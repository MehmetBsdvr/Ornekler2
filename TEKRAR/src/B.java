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
public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Klavyeden bir sayı giriniz");
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz");
        int x=input.nextInt();
        System.out.println("İkinci kenarı giriniz");
        int y=input.nextInt();
        
        
        int toplam=(x+y);
        int z=0;
        
        while(toplam<=180){
            z=180-(x+y);
            System.out.println("Üçüncü kenar: "+z);
        }
        
        System.out.println("Üçüncü kenar: "+z);
        
    }
        
        }

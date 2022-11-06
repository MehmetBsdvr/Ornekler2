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
public class C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        
        int vize;
        
        int finall;
        
        do{
            System.out.println( "Vize notunuzu giriniz");
            vize=input.nextInt();
        }
        while(vize>0 || vize<=100);
        
        System.out.println("Vize notu:"+vize);
        
        do{
            System.out.println( "Final notunuzu giriniz");
            finall=input.nextInt();
        }
        while(finall>0 || finall<=100);
        System.out.println("Final notu:"+finall);
        
        double ort =(double)(vize/40*100+finall/60*100); 
        
        if(ort>80 && ort<=100){
            System.out.println("Notunuz AA:"+ort);
        }
        else if(ort>60 && ort<=80){
            System.out.println("Notunuz BB:"+ort);
        }
        else if(ort>50 && ort<=60){
            System.out.println("Notunuz CC:"+ort);
        }
        else{ 
            System.out.println("Notunuz FF:"+ort);
        
    }
        }
}
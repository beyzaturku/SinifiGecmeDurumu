package sınıfıgeçmedurumunuhesaplayanprogram;
import java.util.*;
public class SınıfıGeçmeDurumunuHesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik notunu giriniz:");
        int matematik = input.nextInt();
        
        System.out.print("Fizik notunu giriniz:");
        int fizik = input.nextInt();
        
        System.out.print("Türkçe notunu giriniz:");
        int turkce = input.nextInt();
        
        System.out.print("Kimya notunu giriniz:");
        int kimya = input.nextInt();
        
        System.out.print("Müzik notunu giriniz:");
        int muzik = input.nextInt();
        
        int ortalama = (matematik+fizik+turkce+kimya+muzik)/5;
        System.out.println("Ortalama:" + " " + ortalama);
        
        if(ortalama>60)
        {
            System.out.print("Sınıfı geçti.");
        }
        else {
            System.out.print("Sınıfta kaldı.");
        }
        
    }
    
}

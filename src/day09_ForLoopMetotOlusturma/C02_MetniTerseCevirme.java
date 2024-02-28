package day09_ForLoopMetotOlusturma;

import java.util.Scanner;

public class C02_MetniTerseCevirme {
    public static void main(String[] args) {


        // Soru 10 (interview)- Kullanicidan bir String isteyin
        //         ve String’i tersine cevirip kaydedin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Terse cevirmek ıstedıgınız metni girin");
        String metin = scanner.nextLine();

        String tersMetin ="";


        for (int i = metin.length()-1; i>=0; i--) {

            tersMetin += metin.charAt(i);
            
        }

        tersMetin=metin;
        System.out.print("Metnin son hali :"  +  metin);
    }
    
    
    


     
}

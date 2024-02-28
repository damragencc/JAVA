package day11_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_Loops {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //	       Ornek :  input : 16, output: true ( 4 * 4 = 16)


        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamkare kontorlü ıcın pozitif bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();

        // for loop ile yapalım

        for (int i = 1; i*i <=girilenSayi ; i++) {

            if (i*i == girilenSayi){

            }


        }

    }
}

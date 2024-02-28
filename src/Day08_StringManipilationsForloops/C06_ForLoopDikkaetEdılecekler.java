package Day08_StringManipilationsForloops;

import java.util.Scanner;

public class C06_ForLoopDikkaetEdılecekler {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi dahil) 7 ila bolunebilen sayilari yazdirin.



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz...");

        int girilenSayı = scanner.nextInt();

               for (int i =1; i<=girilenSayı; i++ ) {

                   if (i % 7 == 0) {

                       System.out.print(i + " ");
                   }
               }




    }
            }













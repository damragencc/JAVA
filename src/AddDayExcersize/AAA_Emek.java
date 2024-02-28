package AddDayExcersize;

import java.util.Scanner;

public class AAA_Emek {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cınsıyetınızı gırınız Erkek : E Kadın : K");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasınızı gırınız");
        int yas = scanner.nextInt();


          if (cinsiyet=='E' && yas>65){
              System.out.println("Emekli olabilirsin");
          } else if (cinsiyet=='E') {
              System.out.println("Emeklı olabılırmen ıcın : " +(65-yas)+ " yıl daha calısman gerekıyor");

          } else if (cinsiyet=='K' && yas>60) {
              System.out.println("Emeklı olabılırısn");

          } else if (cinsiyet=='K') {
              System.out.println("Emeklı olman ıcın : " +(60-yas)+ "yıl daha calısman gerekiyor");

          }else
              System.out.println("K veya E secmelısın");
    }

    }











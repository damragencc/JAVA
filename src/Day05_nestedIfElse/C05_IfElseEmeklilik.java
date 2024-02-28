package Day05_nestedIfElse;

import java.util.Scanner;

public class C05_IfElseEmeklilik {
    public static void main(String[] args) {

        //Soru1 Kullanıcıdan cinsiyetini ve yasını alın
        // Kadın 60 yas ve üzeri Erkek 65 yas ve üzeri emekli olabilir
        // Cinsiyet ve uasını dikkate alarak "Emekeli olabilirsin
        // veya Emekli olmak için .. yıl daha çalışman gerekir" yazdırın


           Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz Erkek : E  Kadın : K");
        char cinsiyet = scanner.next().charAt(0);

        System.out.println("Lutfen yasınızı giriniz");
        int yas = scanner.nextInt();

        if (yas<0){
            System.out.println("Lutfen gecerli sayı giriniz");

        }else if(cinsiyet=='E' && yas>=65){
            System.out.println("emekli olabilirsiniz");
        } else if (cinsiyet=='E') {
            System.out.println("emekli olabilmeniz icin : " +(65-yas)+ " yıl daha calısmanız gerekiyor");

        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Emekli olabilirsiniz");

        } else if (cinsiyet=='K') {
            System.out.println("Emekli olabilmeniz icin : " +(60-yas)+ " yıl daha calısmanız gerekiyor");

        }else
            System.out.println("Lutfen gecerli sayi giriniz");


    }


    }











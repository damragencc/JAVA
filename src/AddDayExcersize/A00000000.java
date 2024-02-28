package AddDayExcersize;

import java.util.Scanner;

public class A00000000 {
    public static void main(String[] args) {
        // ogrencinin notunu isteyin
        // 0'dan kucuk veya 100'den buyuk notlar icin "gecersiz not" yazdirin
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu  degilse) 65 ve ustu ise BB,
        //(65 ve ustu  de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu gırınız");
        int not= scanner.nextInt();

        if(not==0 || not==100){
            System.out.println("Lutfen gecerlı bir not giriniz");

        } else if (not>=85) {
            System.out.println("NOtunuz : AA ");

        } else if (not>=65) {
            System.out.println("Notunuz : BB");

        } else if (not>50) {
            System.out.println("Notunuz : CC");

        }else
            System.out.println("Notunuz : DD");



    }
}

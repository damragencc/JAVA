package AddDayExcersize;

import java.util.Scanner;

public class AA04_FOrEachLoop {
    public static void main(String[] args) {

        /*
            Kullanıcıdan bir cumle ve bır harf alın, harf cumlede
            kullanılmıssa kac kere kullanıldıgını yazdırın kullanılmadıysa
            harf cumlede kullanılmamıs yazın

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();
        System.out.println("Lutfen bir harf girin");
        String harf = scanner.nextLine();

        String[] harfler = cumle.split("");

        int sayac = 0;

        for (String each : harfler
        ) {
            if (each.contains(harf)) {
                sayac++;

            }
            }
        if (sayac == 0){
            System.out.println("Verilen "   + harf +   "Cumelede kullanılmamıs" );

        }else {
            System.out.println("Verilen harf cumlede " +sayac+ "kullanılmıstır");
        }




    }}








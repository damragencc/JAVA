package Day16_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C04_HarfKullanımSayıları {
    public static void main(String[] args) {
        /*
      Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa
      kac kere kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen bir harf giriniz");
        String harf = scanner.nextLine();

        String [] harfler = cumle.split("");
        System.out.println(Arrays.toString(harfler));
        
        int sayac = 0;

        for (String each:harfler
        ) {
            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("Verilen " +harf+ "Cumelede kullanılmamıs" );

        }else {
            System.out.println("Verilen harf cumlede " +sayac+ "kullanılmıstır");
        }
    }
}

package AddDayExcersize;

import java.util.Scanner;

public class L01_02 {
    public static void main(String[] args) {
        /*
       Bir kullanıcının girdiği sayının mükemmel sayı olup olmadığını kontrol eden bir
       Java programı yazın. Mükemmel sayı, kendisi hariç tüm pozitif bölenlerinin
         toplamı kendisine eşit olan bir sayıdır.
         Örneğin, 6'nın bölenleri 1, 2 ve 3'tür, ve 1 + 2 + 3 = 6 olduğu için 6 bir mükemmel sayıdır.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi = scanner.nextInt();
        int toplam =0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi % i==0){
                toplam+=i;
            }

        }
        if (sayi==toplam){
            System.out.println("Sayı mukemmel bir sayı");
        }else{
            System.out.println("Mukemmel bir sayı degıl");
        }

    }
}

package Persembe_Pratic;

import java.util.Scanner;

public class C03_IFELSE {
    public static void main(String[] args) {

        /*
     Soru ) Interview Question
     Kullanicidan artik yil olup olmadigini kontrol
     etmek icin yil girmesini isteyin.
     Kural 1: 4 ile bolunen yillar artik yildir
     Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
     Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

 */

        Scanner scanner = new Scanner(System.in);
        int yil = scanner.nextInt();

        if (yil%400== 0 && yil%100==0 || yil%4==0 && yil%100!=0) {
            System.out.println(yil + "yılı bir artık yılıdır.şubat ayı 29 gun olacaktır");
        }else {
            System.out.println(yil + "yılı bir artık yıl degildir");
        }



    }
}

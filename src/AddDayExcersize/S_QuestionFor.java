package AddDayExcersize;

import java.util.Scanner;

public class S_QuestionFor {
    public static void main(String[] args) {

        // 100'den 1 E kadar olan tek sayılar
        // 0 ile 100 arasında hem 3 e hem de 7 ye bölunebılen sayılar özel sayıdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi = scanner.nextInt();

        for (int i = 0; 99 <sayi; i++) {

            if (sayi % 2 == 0){
                System.out.println("Sayı çift sayıdır");

            } else if (sayi % 7 == 0) {
                System.out.println("Sayı özel bir sayıdır");

            } else if (sayi % 3 == 0) {
                System.out.println("Sayı tektir");

            }else{
                System.out.println("Gecerli sayı giriniz");

        }

        }

    }
}

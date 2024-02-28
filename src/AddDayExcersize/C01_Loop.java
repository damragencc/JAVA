package AddDayExcersize;

import java.util.Scanner;

public class C01_Loop {
    public static void main(String[] args) {

        //Soru: Kullanıcıdan pozitif bir tamsayı isteyin
        //1 den girilen sayıya kadar (girilen her sayı dahil) 7 ile bolunebilen sayıları yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz");

        int girilenSayı = scanner.nextInt();


        for (int i = 1; i <= girilenSayı; i++) {
            if (i % 7 == 0) {

                System.out.print(i + " ");


            }
        }
    }}

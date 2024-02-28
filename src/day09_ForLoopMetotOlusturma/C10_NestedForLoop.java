package day09_ForLoopMetotOlusturma;

import java.util.Scanner;

public class C10_NestedForLoop {
    public static void main(String[] args) {

        /*
            Kullanicidan satir sayisini alip
            asagidaki sekli olusturun

            *
            * *
            * * *
            * * * *
            * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satirlari

            for (int j = 1; j <=i ; j++) { // her satirdaki sutunu

                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}

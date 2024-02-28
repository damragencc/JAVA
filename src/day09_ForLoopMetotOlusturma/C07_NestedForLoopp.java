package day09_ForLoopMetotOlusturma;

import java.util.Scanner;

public class C07_NestedForLoopp {
    public static void main(String[] args) {

     /*
            Kullanicidan satir ve sutun sayisini alip
            asagidaki sekli olusturun

            or satir 5, sutun 7

            * * * * * * *
            * * * * * * *
            * * * * * * *
            * * * * * * *
            * * * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayısı giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Lutfen bir sutun sayısı giriniz...");
        int sutun = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {


                System.out.print(" * ");

            }
            System.out.println("");

        }




    }
}

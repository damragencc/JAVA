package day09_ForLoopMetotOlusturma;

import java.util.Scanner;

public class C06_NestedForLoop {
    public static void main(String[] args) {


        /*
            Kullanicidan satir ve sutun sayisini alip
            asagidaki sekli olusturun

            or : satir 5, sutun 3
            1 2 3
            2 4 6
            3 6 9
            4 8 12
            5 10 15
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir satir giriniz...");
        int satir = scanner.nextInt();


        System.out.println("Lutfen bir sutun giriniz...");
        int sutun = scanner.nextInt();


        for (int i = 1; i <=satir; i++) {
            for (int j = 1; j <=sutun ; j++) {

                System.out.print(i*j  +  " ");

            }
            System.out.println("");


        }
    }
}

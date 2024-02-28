package D09_ForLoopOlusturma;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

           /*
             Kullanicidan satir sayisini alip
asagidaki sekli olusturun

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayısı gırınız...");
        int satir = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print( "* ");

            }
            System.out.println("");
        }

    }
}
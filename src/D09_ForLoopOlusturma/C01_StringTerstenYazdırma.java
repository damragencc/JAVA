package D09_ForLoopOlusturma;

import java.util.Scanner;

public class C01_StringTerstenYazdırma {
    public static void main(String[] args) {

        //soru Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner = new Scanner(System.in);
        String metin = scanner.nextLine();

        for (int i = metin.length()-1; i>0 ; i--) {
            System.out.println(metin.charAt(i));

        }
    }
}

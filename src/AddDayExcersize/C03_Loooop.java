package AddDayExcersize;

import java.util.Scanner;

public class C03_Loooop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı gırınız..");

        int girilenSayi=scanner.nextInt();
        int carpım = 1;

        for (int i = 1; i <=girilenSayi ; i++) {
            carpım *=i;





        }
        System.out.println(girilenSayi + "! = " + carpım);
    }
}

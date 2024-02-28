package Day08_StringManipilationsForloops;

import java.util.Scanner;

public class C09_ForLoop1 {
    public static void main(String[] args) {

        //Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
        //	- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //	- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //	- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int girilenSayı = scanner.nextInt();


        for (int i = 1; i <= girilenSayı; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else {
                System.out.print(i + "");


            }


        }
    }}




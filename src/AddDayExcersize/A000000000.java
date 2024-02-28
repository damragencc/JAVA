package AddDayExcersize;

import java.util.Scanner;

public class A000000000 {
    public static void main(String[] args) {

        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        //        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        //        vucut kitle endeksi
        //          30’dan buyukse obez,
        //          25-30 arasi ise kilolu,
        //          20-25 arasi ise normal,
        //          20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kılonuzu gırınız");
        double kilo =scanner.nextInt();
        System.out.println("Lutfen boyunuzu gırınız");
        double boy = scanner.nextDouble();

        double index =(kilo*10000/(boy*boy));
        System.out.println("Vucut kitke endeksınız : " +index);


        if (index>30){
            System.out.println("obez");
        } else if (index>25) {
            System.out.println("kilolu");

        } else if (index>20) {
            System.out.println("Normal");

        }else
            System.out.println("Zayıf");
        }

    }


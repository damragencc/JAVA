package Persembe_Pratic;

import java.util.Scanner;

public class C02_IFELseQuestions {
    public static void main(String[] args) {


        // Kullanicidan  yasini ve kilosunu alaliniz
        // 18 yasindan kucuk ise kan bagisi yapamaz
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasınızı ve kılonuzu giriniz");
        int yas = scanner.nextInt();
        double kilo = scanner.nextDouble();
        System.out.println("Kan bagısı ıcın E yada H giriniz ");
        char kanBagısı = scanner.next().toUpperCase().charAt(0);


        if (yas>=18 && kilo>50){
            System.out.println("Kan bagısında bulunabilirsiniz");



        }
    }
}

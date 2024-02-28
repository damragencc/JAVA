package Persembe_Pratic;

import java.util.Scanner;

public class M02_IFELSe {
    public static void main(String[] args) {
      /*
                * Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
                * degerini hesaplayin. 45 hiz siniridir.
                * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
                * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
                * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
                * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
                * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
                * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
                * -----------------------------------------
                * Orn;
                * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi) = true;
                * sonuc 320 olmalidir.
                * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mı?) =
                * false; sonuc 300 olmalidir.
                */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen hızınızı giriniz..");
        int velocity = scanner.nextInt();
        System.out.println("Ehliyet var mı? E yada H giriniz");
        char Ehliyet = scanner.next().toUpperCase().charAt(0);



       if (Ehliyet == 'E'){
        if (velocity<=55 && velocity<=74){
            System.out.println("Cezanız 300 dolar");

          } else if (velocity<=75 && velocity<=84) {
            System.out.println("Cezanız 350 dolar");
        } else if (velocity<=85 && velocity<=94) {
            System.out.println("Cezanınız 520 dolar");

        } else if (velocity<94) {
            System.out.println("Cezanınz 700 dolar");



        }

       }else {





        if (velocity <= 55 && velocity <= 74) {
            System.out.println("Cezanız 100 dolar");

        } else if (velocity <= 75 && velocity <= 84) {
            System.out.println("Cezanız 150 dolar");
        } else if (velocity <= 85 && velocity <= 94) {
            System.out.println("Cezanınız 320 dolar");

        } else if (velocity < 94) {
            System.out.println("Cezanınz 500 dolar");


        }

    }}}
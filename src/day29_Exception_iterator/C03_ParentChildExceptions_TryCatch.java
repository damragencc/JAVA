package day29_Exception_iterator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ParentChildExceptions_TryCatch {
    public static void main(String[] args)  {

        /*
            Eger kodu try catch icine alip
            exception'i handle etmek istersek
            Java 4 alternatif sunuyor

            1- var olan catch disinda bir catch daha eklemek
               Eger birden fazla catch cumlesi kullanacaksak
               ve exception'lar arasinda parent-child iliskisi varsa
               once child yazilmalidir
               Cunku once parent'i yazarsak parent tum exception'lari yakalayacagından
               chill exceptin'i yazmak anlamsiz olacaktir

            2- parent exception tum riskleri kapsadigindan,
              catch cumlesinde sadece parent'i yazmak
              bu durumda acıklama yazdiracaksak
              parent exception'a uygun genel bir acıklama yazdirilmalidir.
            3-nested try-catch kullanmak
            4-method signature'ina uyari yazmak
         */

        String dosyaYolu="src/day28_Exception/deneme.txt";

        try {
            FileInputStream fileInputStream =new FileInputStream(dosyaYolu);

            int k=0;
            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                //Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Verilen dosya turu hatali");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

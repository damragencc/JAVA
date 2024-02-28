package day29_Exception_iterator;

import java.io.FileInputStream;

import java.io.IOException;

public class C02_ParentChildExceptions {
    public static void main(String[] args) throws IOException, IOException {

        /*
         Olusmasi muhtemel exceptiona'lar arasinda
         Parent-Child iliskisi varsa

         Parent exception, daha fazla exception yakalamak uzere hazirlamistir
         Parent exception, tum child exception'lari kapsadigindan
         child exception'larin yakalayacagi exceptionları yakalar


         Bu sebeple iki exception'i yazmak yerine
         daha kapsamli olan parent exceptionu yazmak yeterli olacaktir
         */





        //deneme.txt dosyasinin icerigini yazdirin

        String dosyaYolu="src/day28_Exception/deneme.txt";

        FileInputStream fileInputStream =new FileInputStream(dosyaYolu);

        int k=0;
        while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
            //Unhandled exception: java.io.IOException
            System.out.print((char) k);
        }
    }
}

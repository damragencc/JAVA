package day28_Exception;

import java.io.FileInputStream;

public class C02_Exceptions {
    public static void main(String[] args) {

        //Java Compile time'da variablerin degerlerini goremez
        // ama data turlerını gbilir

        //yazdigimiz kodları syntax ve data türleri acısından kontrol edip
        //uygun olmayan bir durumla karsılasırsa CTE verir


        //ANCAK alti cizilen her durum CTError degildir
        //bazen Compile Time Exception da olabilir


         //String str = 5;

       // FileInputStream fileInputStream = new FileInputStream("asd");

        String str = "Java Candir";

        System.out.println(str.substring(7)); // ndir
        //System.out.println(str.substring(15)); //StringIndexOutOfBoundsException

        str =null;
        System.out.println(str.length()); //NullPointerException


    }
}

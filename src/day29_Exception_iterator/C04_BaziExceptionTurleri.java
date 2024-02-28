package day29_Exception_iterator;

import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_BaziExceptionTurleri {
    public static void main(String[] args) {

        //NullPointException
        //Bir variable null olarak isaretlenip
        //sonra yazdirma disinda bir islem yapilirsa NPE olusur

        String str = null;
        System.out.println(str);//null


        //StringIndexOutOfBoundsException
        //  ArrayIndexOutOfBoundsException
        // ArithmeticException


        //NumberFormatException
        //Stringi Integer'a parse yapmaya calisirken
        //String sayi olmayan bir karakter iceriyorsa olusur

        String say1="24";
        String say2="12";

        //say1 ve say2'i sayisal olarak toplayin

        System.out.println(say1+say2); //2412

        //System.out.println(Integer.parseInt(say1)+Integer.parseInt(say2)); //36

        //ClassCastException

        Integer sayi =10;


        Object obj=sayi; //Object HAS-A Integer

        String str1 =(String) obj;//Str,ng IS-A Object


        //FileNotFoundException
         // IOException => Dosya Input-Output exception Parent exception
    }
}

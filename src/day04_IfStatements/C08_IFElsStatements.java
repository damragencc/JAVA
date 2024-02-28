package day04_IfStatements;

import java.util.Scanner;

public class  C08_IFElsStatements {
    public static void main(String[] args) {


        // kullanıcıdan bir harf isteyin
        //girilen karakter kucuk harf ise onu buyuk harf olarak yazdırın
        //yoksa girilen karakteri girildşiği gibi yazın

      Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

           char harf=scanner.next().charAt(0);



           if (Character.isLowerCase(harf)){
               System.out.println(Character.toUpperCase(harf));
           }else
               System.out.println(harf);







        }
    }


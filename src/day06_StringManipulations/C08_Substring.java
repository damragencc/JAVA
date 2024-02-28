package day06_StringManipulations;

public class C08_Substring {
    public static void main(String[] args) {

        String str = "Java Guzeldir";

        System.out.println(str.substring(2, 7)); // va Gu

        // Bastaki harfi alır sondaki almaz

        // ilk 3 karakteri yazdırın

        System.out.println(str.substring(0, 3)); //Jav

        //sadece 3.karakteri substring ile yazdırın

        System.out.println(str.substring(2, 3)); // v

        System.out.println(str.substring(3,3)); // "" bos bir satır yazdırdı




        String str1 = "ja";
        String str2 = "va";

        System.out.println(str1+str2); // java
    }
}

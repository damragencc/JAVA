package day06_StringManipulations;

public class C07_Substring {
    public static void main(String[] args) {


        String str = "Java Guzeldir";

        System.out.println(str.substring(2)); // va Guzeldir
        System.out.println(str.substring(0)); // Java Guzeldir

        // substring kullanarak son harfi yazdırın

        System.out.println(str.substring(str.length() -1)); // r

        // son 3 harf yazdırın

        System.out.println(str.substring(str.length() -3)); // dir

        // son 5 harf yazdırın

        System.out.println(str.substring(str.length() -5)); // eldir





    }
}

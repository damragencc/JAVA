package day07_StringManipilationss;

public class C07_ReplaceAll {
    public static void main(String[] args) {


        String str = "#Ja45!v0A C1&*an073di23@r";

        // sayilardan kurtulmak istiyorum

        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str); //

        // space haric tum ozel karakterleri silin
        // space yok etmemek icin space yerine gecici olarak bir deger atayalım
        // sayiları temızledıgımız icin space yerine herhangi bir sayi atayalım

        str = str.replace(" ", "3");

        str = str.replaceAll("\\W", "");

        System.out.println(str.replace("3", " "));


    }
}
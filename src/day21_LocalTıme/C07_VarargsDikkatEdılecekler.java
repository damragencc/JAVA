package day21_LocalTıme;

public class C07_VarargsDikkatEdılecekler {
    public static void main(String[] args) {

        /*
        Varargs konusunda dikkat etmemiz gereken tek bir sey var

        EGER bir methoda parametre olarak varargs varsa en sonda olmalıdır
        bu kuralın sonucu olarak
        bir methoda birden fazla varargs olamaz
         */


    //argument olarak verilen ılk sayılardan
    //son sayı  harıc geriye kalanları toplayıp
    //bulunan toplam degeri ile ilk sayının carpımını
    //yazdıran bir method olusturun

    islem (2);
    islem(2,4);
    islem(3,5,6);
    islem(1,6,8,9);

        //varargs devreye gırdıgınde
        //tum argumentlerı alır
        //sanada baska element ayırmanıza ızın vermez
}
public static void islem(int...geriyeKalanlar){

        // varargs sonrasında eleman ayırmadıgınız ıcın
    //soruda istenılen islemi tek vararg ıcınde halledelim

    int toplam=0;
    int sonSayi=geriyeKalanlar[geriyeKalanlar.length-1];

    for (int i = 0; i < geriyeKalanlar.length-2; i++) {

   toplam  +=     geriyeKalanlar[i];

    }
    System.out.println("İslem sonucu :  "  +(toplam*sonSayi));
}
    }
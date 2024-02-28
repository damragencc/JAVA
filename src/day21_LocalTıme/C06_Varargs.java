package day21_LocalTıme;

public class C06_Varargs {
    public static void main(String[] args) {

        //argument olarak verilen ılk sayılardan
        //ilki harıc geriye kalanları toplayıp
        //bulunan toplam degeri ile ilk sayının carpımını
        //yazdıran bir method olusturun

        islem (2);
        islem(2,4);
        islem(3,5,6);
        islem(1,6,8,9);
    }

    public static void islem(int ilksayi, int...geriyeKalanlar){

        int toplam = 0;

        for (int each:geriyeKalanlar
             ) {

            toplam+=each;

        }
        System.out.println("Islem sonucu : " +toplam*ilksayi);





        }
    }


package day21_LocalTıme;

public class C05_Varargs {
    public static void main(String[] args) {

        // argument olarak yollanan tamsayılardan
        // tek sayi olanları toplayıp sonucu yazdıran bir method olusturun


        toplam (2);
        toplam(2,4);
        toplam(3,5,6);
        toplam(1,6,8,9);


    }

    public  static void toplam (int... sayilar){
        int toplam =0;

        for (int v:sayilar
             ) {

            if (v%2 !=0){
                toplam+=v;

            }

        }
        System.out.println("Tek sayıların toplamı : " +toplam);

    }
}

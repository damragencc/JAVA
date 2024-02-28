package day13_Arrey;

public class C02_PozitifElemanlarıTOplama {
    public static void main(String[] args) {

        //Soru2- Verilen bir array daki
        //       pozitif tamsayıları toplayın
        //       sonucu bize donduren bir method yazınız.

        int[] arr = {3, 5, -6, 8, 0, -9, 5};
        System.out.println(pozitifElemanlarıTopla(arr));

        // verilen arraydaki pozitif tamsayıların
        // ortalamalarını double olarak donduren bir method olusturun

        System.out.println(pozitifElemanlarınOrtalamasınıHesapla(arr));


    }

    public static int pozitifElemanlarıTopla(int[] arr) {
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplam += arr[i];
            }

        }
        return toplam;

    }

    public static double pozitifElemanlarınOrtalamasınıHesapla(int[] arr) {
        double toplam = 0;
        int pozitifSayiAdedi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplam += arr[i];
                pozitifSayiAdedi++;


            }
        }
        return toplam / pozitifSayiAdedi;

    }
}

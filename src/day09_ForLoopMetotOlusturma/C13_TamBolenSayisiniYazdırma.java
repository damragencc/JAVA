package day09_ForLoopMetotOlusturma;

public class C13_TamBolenSayisiniYazdırma {
    public static void main(String[] args) {

        // Verilen pozitif bir tamsayinin
        // pozitif tam bolen sayisini yazdiran bir method olusturun
        // PTBS  input : 20  output :6    (1,2,4,5,10,20)

        PozitifTamSayiBolen(20); // 6 tane pozitif böleni var
        PozitifTamSayiBolen(15); // 4 tane pozitif böleni var

    }

    public static void PozitifTamSayiBolen(int sayi) {

        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;

            }
        }

        System.out.println("Verilen " + sayi +" sayisinin " + sayac + "adet pozitif tam boleni var");
    }
}
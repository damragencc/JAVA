package day09_ForLoopMetotOlusturma;

public class C16_FaktoriyeLhesaplama {
    public static void main(String[] args) {
        // Verilen pozitif bir tamsayinin
        // faktoryel degerini yazdiran bir method olusturun
        // input:5   output :120   ( 5*4*3*2*1 )

        faktorıyelDegerınıYazdır(10);
    }

    public static void faktorıyelDegerınıYazdır(int sayi){
           int faktorıyel = 1;

        for (int i = sayi; i>=1 ; i--) {

            faktorıyel *= i;


        }
        System.out.println(sayi + "! =" + faktorıyel );
    }
}

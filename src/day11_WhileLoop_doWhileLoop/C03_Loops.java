package day11_WhileLoop_doWhileLoop;

public class C03_Loops {
    public static void main(String[] args) {

        // Soru -'k' harfinden 't' harfine kadar harflerin yazdırın

        /*
        Do while loopun avantajı
        while loop da kullanıcıdan alacagınız degeri baslangıc icin kendimiz atadıgımızda
        yanlıs deger verirsek loop bodysi hic calısmayabılırdı
        Do while loop kontrolden once do bodysini calıstırdıgı icin
        do-bodysinde kullancıdan degeri alırız ve
        basta bizim


        Do while loopun dezavantajı
        hic calısmaması gereken durum bile olsa
        loop bodysi en az bir kere calısır.
         */

        for (char i = 'k'; i < 't'; i++) {

            System.out.print(i + "");
        }
        System.out.println("");


        // while loop ile yapalım

        char harf = 'k';

        while (harf<='t'){
            System.out.print(harf + "");
            harf++;

        }
        System.out.println("");

        // do while loop ile yapalım
        harf = 'k';

        do {
            System.out.print(harf + " ");
            harf++;
        }while (harf<= 't');

        System.out.println("");
    }
}

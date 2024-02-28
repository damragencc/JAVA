package Day08_StringManipilationsForloops;

public class C01_StringFiyatlarıToplama {
    public static void main(String[] args) {

        String fiyat1 = "15.35 €";
        String fiyat2 = "11.40 €";
        // Eger para birimi degisebilir denseydi, sona  € yazmak yerine
        // en bastaki para birimini yazmaliydik

        // bunun icin space'den sonrasini almamiz lazim


        System.out.println(fiyat2+fiyat1); // 11.40€ 15.35€ diyr yazar

        fiyat1 = fiyat1.replaceAll("\\D", "");
        fiyat2 = fiyat2.replaceAll("\\D", "");
        System.out.println(fiyat2+fiyat1);

        double fiyat1Dbl= Double.parseDouble(fiyat1);
        double fiyat2Dbl= Double.parseDouble(fiyat2);

        System.out.println(fiyat1Dbl+fiyat2Dbl); //2675.0

        System.out.println( (fiyat1Dbl+fiyat2Dbl)/100 + " €" );









    }
}

package day09_ForLoopMetotOlusturma;

public class C14_IsmıIstenenFormattaYazdırma  {
    public static void main(String[] args) {

        // Verilen isim,soyisim ve KK numarasini asagida verilen formatta yazdiran
        // bir method olusturun
        // input Ali, Kayali, 1234567890123456
        // output A** K*****, **** **** **** 3456
      IsmıDuzenleYazdır("Damra", "Genc","3456765432424567");
    }

    public static void IsmıDuzenleYazdır(String isim, String soyad, String kkno){

         String duzenlenmısHali= isim.toUpperCase().charAt(0) +
                                 isim.substring(1).replaceAll("\\w", "*") +
                                  ",  " + soyad.toUpperCase().charAt(0) + soyad.substring(1).replaceAll("\\w", "*") +
                                  ",**** **** **** " + kkno.substring(kkno.length()-4);


        System.out.println(duzenlenmısHali);


    }
}

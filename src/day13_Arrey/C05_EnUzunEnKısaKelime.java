package day13_Arrey;

public class C05_EnUzunEnKısaKelime {
    public static void main(String[] args) {

        //Soru 6- Verilen String bir arraydeki en uzun
        //        ve en kısa kelimeleri yazdıran bir method olusturun

        String[] isimler = {"Gökcen", "Berk", "Murat","Selcuk", "Muhammed","Ali"};



        EnuzunKelimeleriYazdır(isimler);

    }

    public static void EnuzunKelimeleriYazdır(String[] kelimeler){
        String enUzunKelime = kelimeler[0];
        String enKısaKelime = kelimeler[0];
      ;
        for (int i = 0; i < kelimeler.length ; i++) {
            if (kelimeler[i].length() > enUzunKelime.length()) {
                enUzunKelime = kelimeler[i];

            }
        if (kelimeler[i].length() < enKısaKelime.length()){
                enKısaKelime = kelimeler[i];
            }


        }
        System.out.println("En uzun kelime : " + enUzunKelime);
        System.out.println("En Kısa kelime : " + enKısaKelime);

    }

}

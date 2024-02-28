package day25_intellianceDatatypeKullanımı;

public class C06_AvcıKuslar extends C05_Kuslar {
    public void hareket() {
        System.out.println("ucarlar");
    }
    public void beslenme() {
        System.out.println("et yerler");
    }
    public void pence() {
        System.out.println("pencelidir");
    }
    public void gaga() {
        System.out.println("sivri gagali");
    }

    /*
       ozellikler variable olarak olusturulmus ise JAva
        data turune odaklanir.
        data turu olarak secilen class ve parentlarına bakar
        ve ilk buldugunu kullanır.

        ozellikler method olarak olusturuldugunda
        hem data turu hem de constructor'ın oldugu class ONEM KAZANIR


        -once aramaya data turu olan class'dan baslayip  o ozellik
        bulunur.

        Bulunduktan sonra constructor'ın oldugu class'a kadar daha guncel
        bilgi var mı ? diye kontrol edilir.

        -data turunden aramaya baslandıgında
        ozellik bulunamaz ise CTE verir guncel haline bakmaz.


     */

    public static void main(String[] args) {
        C06_AvcıKuslar kartal1=new C06_AvcıKuslar();

         kartal1.omur();//ha yasar ve olurler
        kartal1.solunum();//ku akcıgerle nefes alırlar
        kartal1.cogalma(); //ku yumurta ile cogalırlar
        kartal1.kanat(); //ku kanatlidırlar
        kartal1.hareket();//av ucarlar
        kartal1.beslenme();//av et yrerler
        kartal1.pence();//av pencelidirler
        kartal1.gaga(); //av sivri gagali


        C05_Kuslar kartal2=new C06_AvcıKuslar();

        //Karta2'nin BUTUN kusların sahip oldugu methodların
        //en guncel halini goruntuler.


        kartal2.omur();// Ha yasar ve olurler
        kartal2.solunum(); // Ku akciger ile solunum
        kartal2.cogalma(); // Ku yumurta ile cogalirlar
        kartal2.kanat(); // Ku kanatlidirlar

        kartal2.hareket(); // Av ucarlar
        kartal2.beslenme();//Av et ile beslenirler
         //kartal2.pence(); // CTE aramaya kuslardan baslar ve pence bulamaz
        kartal2.gaga(); //Av sivri gagalidir



        C04_Hayvanlar kartal3=new C06_AvcıKuslar();

        kartal3.omur();//ha yasar ve olurler
        kartal3.solunum();//kus akcigerle solunum
        kartal3.cogalma(); //kus yumurta ile cogalirlar
        kartal3.hareket();//av ucarlar
        kartal3.beslenme();//av et yerler
        //kartal3.kanat
        //kartal3.pence


        C05_Kuslar kus1=new C05_Kuslar();


        kus1.omur(); // Ha yasar ve olurler
        kus1.solunum(); //Ku akcigerle
        kus1.cogalma(); //Ku yumurta ile cogalirlar
        kus1.kanat(); // //Ku kanatlidir
        kus1.hareket(); // Ha hareket ederler
        kus1.beslenme(); //Ha beslenirler
      //  kus1.pence(); // Aramaya kuslar classından baslar ve kanat bulamaz CTE verir
        kus1.gaga(); // Kus gagaları vardır



        C04_Hayvanlar kus2=new C05_Kuslar();
        kus2.beslenme();//hay beslenirler
        kus2.solunum();//kus akcigerle solunum yaparla
       // kus2.kanat
        kus2.cogalma();//kus yumurta ıle cogalırlar
        kus2.omur();//ha yasar ve olurler
        kus2.hareket();//ha hareket ederler




        C04_Hayvanlar hayvan1=new C04_Hayvanlar();
        hayvan1.omur(); // Ha yasar ve olurler
        hayvan1.solunum(); //Ku akcigerle
        hayvan1.cogalma(); //Ku yumurta ile cogalirlar
        //hayvan1.kanat(); // Aramaya Hayvanlar classından baslar ve kanat bulamaz CTE ver
        hayvan1.hareket(); // Ha hareket ederler
        hayvan1.beslenme(); //Ha beslenirler
        //hayvan1.pence(); // Aramaya Hayvanlar classından baslar ve pence bulamaz CTE verir
        //hayvan1.gaga(); // // Aramaya Hayvanlar classından baslar ve gaga bulamaz CTE verir



    }

}

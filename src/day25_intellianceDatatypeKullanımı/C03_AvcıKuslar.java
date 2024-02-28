package day25_intellianceDatatypeKullanımı;

public class C03_AvcıKuslar extends C02_Kuslar {
    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagali";

    /*
    Java'da ozellikler variable olarak olusturulursa
    Java data Type'inda odaklanır
    yani ozelligi aramaya data type olara yazılan class'dan
    baslar...
     */

    public static void main(String[] args) {

        C01_Hayvanlar obj=new C02_Kuslar();
        System.out.println(obj.hareket);//Ha hareket ederler
        System.out.println(obj.solunum); //ha nefes alirlar
        System.out.println(obj.beslenme); //ha beslenirler
        System.out.println(obj.cogalma); //ha cogalırlar
        System.out.println(obj.omur); //Ha yasar olurler
         //System.out.println(obj.kanat); CTE verir
       // System.out.println(obj.gaga); //Cte verir









    }
}

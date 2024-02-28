package day24_Intelitance;

public class C03_Corsa extends C02_Opel{

    C03_Corsa(){
        super();
        System.out.println("Corsa constructor calisti");
    }

    String model ="Corsa";

    String motor ="vvt";
    String renk ="Belirtilmedi";

    public static void main(String[] args) {

        // Java da olusturualan bir objeye ilk deger atamasının yapılabılmesı icin
        // constructor calısmalıdır..
        // Nasıl oldugu da sadece C03() calısarak paranti olan
        // Opel ve araba classındaki ozellikleri
        // olusuturulan corsa1 objesıne ekledi...

        C03_Corsa corsa1 =new C03_Corsa();

        System.out.println(corsa1.model); // Corsa
        System.out.println(corsa1.motor); // vvt

        System.out.println(corsa1.renk); // belirtirmedi
        System.out.println(corsa1.kasa); // Belirtirmedi



    }

}

package day25_intellianceDatatypeKullanımı;

public class C08_Child extends C07_Parent{

    public void method1(int a) {

    /*
     biz aynı class da ayni signature'a sahip 2 method olusturamayız

     Override edebilmek icin methodların child class'da olmasi ve parent class'daki
     method ile aynı signature sahip olması gerekir
     */


    }
    public void method2(){

        // overriding yaparken esas olan signature'in aynı olmasidir
        //ancak signature'a dahil olmayan returnType ve
        //access modifier icin de kurallar vardır


        }
    public void method3(){

        //Override notasyonunu kullanmak mecburi degildir
        // Ancak kullanmak faydalidir
        //Override parent class'daki override edilen methodu
        //takip eder ve method silinir veya signature'i degistirilirse
        //CTE verir
        //Bu notasyon kullanılmadıysa
        //Overriding method, Overridden methodu takip etmez
        //silinir veya signature'i degistirilirse
        //override etmeden yoluna devam eder
    }
    public void method4(){
        super.method4();
        //Normal sartlarda
        //overriding method ve overridden methoddan sadece biri calısır
        //Ana yazdıgımız kod geregi ikisinin de calismasını isterseniz
        //child class da super.method4(); yazabilirsiniz

    }
    public static void method5(){

        // static methodlar override edilemez
        // biz manuel olarak aynisini yazsak da
        //Java bunlari override olarak kabul etmez
        //birbirleriyle ilgisi olmayan iki farklı method kabul eder

    }
    public void method66(){

        //overridden method is final
        //final method ooverride edilemeyen method demektir
        //signature'i aynı olan bir method yazsak da
        //Java CTE verir ve final method override edilmez diye bize uyarı verir

    }
    private void method7(){

        //Parent class da olsa
        //Private class uyelerine baska class'dan ulasmak mumkun oldugu icin
        //biz aynı methodu child class'da olustursak da
        //bunlari bagimsiz methodlar kabul eder
        //override olarak iliskilendirmez

    }
    public void method8(){

        //Child class'daki overriding method'un access modifier'i
        //parent class'daki overridden method'un access modifier'indan
        // daha kısıtlayıcı olamaz
        //Overridden default access modifier oldugundan
        //bu method default access mod, protected veya public olablir

    }

    public int method9(){
        return 0;
    }

    public void method10(){

    }
    public String method11(){
        return "";
    }


    @Override
    public void method12() {
        super.method12();
    }
}


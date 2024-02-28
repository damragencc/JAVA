package day27_AbstractsClassesInterface;

public class C13_ChildOfİnterfaceİstisna implements C12_Interfaceİstisna{


    /*
       Devam eden projelerde
       Interface'lere sonradan müdahale etmemiz gerektiginde
       o interface'i daha onceden kullanan class'larda ciddi problemlere sebep olabilir


       Java8 ile bu konudaki taleplere istisnai bir cözüm üretmistir

       sonradan eklenen bir methodun
       child class'lar tarafından implement edilme ZORUNLULUGU olmaması icin
       interface icindeki istisnai method'larin
       body'li olustururabilmesine imkan taniyan
       2 keyword tanimlanmistir.
     */
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }

    public static void main(String[] args) {
        /*
          implement ettigimiz C12 InterfaceIstisna
          interface'ine sonradan ekledigimiz
          method4() ve method5()'in bodyleri oldugu icin
          override etme mecburiyeti yoktur


          interface icinde bodysi olan istisnai methodlar olusturmak icin kullandıgımız
          default ve static keywordların farki o methodlara erişim yöntemindedir

          static keyword kullanilarak olusturulan istisnai methodlara InterfaceIsmi.staticMethodIsmi();
          seklinde ulasaırken

          default keyword kullanılarak olusturulan ıstınsai methodlara obje uzerındn ulasılır

         */
     C12_Interfaceİstisna.method5();
     //Interface icindeki static keywordune sahip istisnai method

        C13_ChildOfİnterfaceİstisna obj = new C13_ChildOfİnterfaceİstisna();
        obj.method4();








    }


}

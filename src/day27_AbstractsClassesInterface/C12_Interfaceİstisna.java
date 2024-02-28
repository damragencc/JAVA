package day27_AbstractsClassesInterface;

public interface C12_Interfaceİstisna {

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


    void method1();

    void method2();






int method3 ();

 public default void method4(){

     //burdaki default access modifieer degildir
     // access modifier public ve 2 access modifier kullanilamaz
     //buradaki kullanim default keywordun farkli bir kullanimidir

     System.out.println("Interface ıcındeki default keywordune sahip istisnai method");

 }
 static void method5(){
     System.out.println("Interface ıcındeki static keywordune sahip istisnai method");
 }

}

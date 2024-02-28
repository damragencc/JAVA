package day26_pollymorphism_abstraction;

public abstract class C04_KuralciAbstractParent {

    /*
       Java Parent class'larin soz sahibi olmasi icin
       Abstraction'i gelistirmistir

       Buradaki temel amac
       Bir class olusturdugumuzda bu classi parent edilmek isteyen
       child class'ların parent tarafından belirlenen bazi methodları
       override etme mecburiyeti olmasi saglamaktir.

       Bunu saglamak icin

       1-Class'imizi abstract keyword kullanarak
       abstract class yapmaliyiz

       2-Child class'lari override etmeye mecbur birakacagimiz
        methodlar'i da abstract keyword kullanarak
        abstract
     */

    //bu class'i parant edilenler, method1', kendilerine uyarlamak zorunda olsun

    protected  void method1(){
        System.out.println("parent method1");
    }
    protected  void method2(){
        System.out.println("parent method2");

    }
    protected  void method3() {
        System.out.println("parent method3");

    }}



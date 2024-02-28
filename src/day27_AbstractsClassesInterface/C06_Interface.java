package day27_AbstractsClassesInterface;

public interface C06_Interface {

    //full abstraction saglamak amaciyla olusturuldugu icin
    //tum methodlar public ve abstractir
    //tum variabler ise public,static ve final'dir


    public static final int sayi=10;

    int yas=0;
    //tum variabler finaldir ve
    //final variable'lara sonradan deger atanamaz
    //Bundan dolayi interface'deki tum variable'lara deger atanmak zorundadir


    public abstract void method1();

    abstract void method2();
    public void method3();

  public abstract int substract();


    void method4();

    int method5();

}

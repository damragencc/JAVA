package Day17_Constractors;

public class C02_CarRunner {
    public static void main(String[] args) {
        C01_Car car1 = new C01_Car();

        System.out.println(car1.marka);
        System.out.println(car1.model);
        System.out.println(car1.yil);

        car1.marka ="Toyota";
        car1.model = "Corolla";
        car1.renk = "Lacivert";
        car1.yil = 2010;
        car1.fiyat = 8000;

        System.out.println(car1);

        C01_Car car2=new C01_Car();
        System.out.println(car2);
        car2.marka ="Opel";
        car2.model = "Corsa";
        car2.renk = "Beyaz";
        car2.yil = 2012;
        car2.fiyat = 5000;

        System.out.println(car2);

        C01_Car car3 = new C01_Car("Nissan","Micra");
        System.out.println(car3);


        C01_Car car4 = new C01_Car();
        System.out.println(car4); //marka=' Marka atanmadı', model='null', renk='null', yil=0, fiyat=0}

        // arabanin model,yıl ve fiyatını parametre olarak
        // girebilecegimiz bir consructor olusturalım

        C01_Car car5 = new C01_Car("S40",2005,9000);

        System.out.println(car5);

        //Arabanın tum ozelliklerini parametre olacak yollayabılecegımız
        //bir   constructor olusturun

        C01_Car car6= new C01_Car("Audi","Quatro","Kırmızı",2023,15000);
        System.out.println(car6);




    }
}

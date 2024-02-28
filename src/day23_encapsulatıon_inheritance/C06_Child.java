package day23_encapsulatıon_inheritance;

public class C06_Child extends C05_parent{

    String isim = "Child isim";
    String adres = "Child adress";

    int yas;
    String tel;

    public static void main(String[] args) {

        // Bir class baska bir classi parent edindiginde
        //1-parent class daki tum ozellıklere sahip olur


        C06_Child child1 = new C06_Child();

        System.out.println(child1.ülke);//Parent ülke


        //2-istediginiz özellıklerı child classa göre
        // guncelleyebılırsiniz

        System.out.println(child1.isim); // Bu classda oldugu ıcın parent den almaz // child isim
        System.out.println(child1.adres); // Child adres

        //3-isterse de parent class da olmayan
        // sadece child class da olan yeni özellikler ekleyebilir

        child1.yas=40;
        child1.tel ="1212412412";
    }
}

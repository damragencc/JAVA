package day24_Intelitance;

public class C08_Child extends C07_Parent {

    String isim="Child isim";
    String adres="Child adres";
    int yas=20;
    int boy=180;


    public void method1(){
        System.out.println("Child method1");

    }
    public void method3(){
        System.out.println("Child method3");

    }
    public void method4(){
       String adres ="method adres";
       int yas=40;

       super.metho1();//Child method1
       this.method1();//Child method1
       method1();//Child method1
        System.out.println(super.isim); //parent isim
        System.out.println(this.isim);//Child isim
        System.out.println(isim);//Child isim
        System.out.println(kilo);//80
        System.out.println(this.boy);//180
        System.out.println(boy);//180
        System.out.println(yas); //40
        System.out.println(this.yas); //20
        System.out.println(super.yas); //10
        System.out.println(adres); //method aress
        System.out.println(this.adres); //Child adres
        // System.out.println(super.adrs); //CTE


        /*
        Java da her hangi bir scope'da
        bir variable veya method kullanmak isterseniz
        Java asagidaki sıra ile o variable/methodu arar

        1- icinde olunan scope
        2-icinde olunan class
        3-parent class

        bunlardan ilk buldugunu kullanır

         */


















    }
















    public static void main(String[] args) {

        C08_Child obj=new C08_Child();
        obj.method4();
    }




}

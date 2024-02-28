package day24_Intelitance;

public class C06_C extends C05_parent {
    C06_C(){
       super(5);

        System.out.println("C parametresiz constructor calisti");
    }
    C06_C(String s){
        this();


        System.out.println("C String parametreli constructor calisti");
    }
    C06_C(int a){

        System.out.println("C int parametreli constructor calisti");
    }


    public static void main(String[] args) {

        C06_C child3 = new C06_C("Ali");

        /*
        GP String parametreli
        Gp parametresiz
        P string
        P parametresiz
        P int parametreli
        C parametresiz
        C string parametreli



         */

        //C06_C chilkd2 =new C06_C();

       // C06_C child1 = new C06_C(5);


        /*
          1- extends keyword kullanan bir classdaki
          her constructor'ın ilk satirinda
          MUTLAKA constructor call olmalidir...

          2- Eger gorunur bir constructor call yoksa
          JAva default olarak PARAMETRESİZ super() koyar...

          3- Eger kodu yazan kisi this(ilgili parametre) veya
          super(ilgiliParametre) kullanmissa bir constructor'da
          sadece 1 constructor call olacagı icin Java
           otomatik koydugu super()

         */


    }


}

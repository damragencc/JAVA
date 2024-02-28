package day25_intellianceDatatypeKullanımı;

public class C07_Parent {
    public void method1(){

        // child class'daki method1'in signature'i farklı oldugu icin
        //override edilmis olmaz

    }

    public void method2(){

    }
    public void method3(){

    }

    public void method4(){

    }

    public static void method5(){

    }

    public final void method6(){

    }

    private void method7(){

    }
   protected void method8(){

    }
    public int method9(){
        //overriden methodun return type'i
        //primitive veya void ise
        //overriding method da aynı olmalidir
        return 0;
    }
    public void method10(){

    }

    public String method11(){
        //return type non_primitive ise
        //child classdaki methodun return type
        //ya parent classdaki methodun return type'ı ile aynı olmalidir
        //yada onun childı olmalıdır
        //buna Covoriant data turu denir
        return "";
    }

    public void method12(){

    }




    }






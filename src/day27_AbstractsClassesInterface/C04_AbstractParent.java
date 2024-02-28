package day27_AbstractsClassesInterface;

public abstract class C04_AbstractParent extends C01_AbstractGrandParent{

    //Abstract Class'larin abstract child class'lari
    //abstract methodlari override etmek Zorunda değildir
    //isterse override edebilir.
    //Concrete bir class'in concrete childi gibi davranir

    public abstract void method1();

    public void method2(){
        System.out.println("Abstract parent method2");

    }

    public abstract void method3();

    public abstract void method6();

    public void method7(){
        System.out.println();
    }


    }



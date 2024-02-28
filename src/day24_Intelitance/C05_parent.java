package day24_Intelitance;

public class C05_parent extends C04_GP{

    C05_parent(){
        this("Murat");

        System.out.println("P parametresiz constructor calisti");


    }
    C05_parent(String s){
        super();

        System.out.println("P String parametreli constructor calisti");
    }
    C05_parent(int a){
        this();

        System.out.println("P int parametreli constructor calisti");
    }

    }

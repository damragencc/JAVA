package day21_LocalTıme;

public class C04_Varags {
    public static void main(String[] args) {


        // Varags : variety of arguments,

        carpim(5,7);
        carpim(3,4,5);
        toplam (2);
        toplam(2,4);
        toplam(3,5,6);
        toplam(1,6,8,9);
    }

    public static void carpim (int a, int b){


        System.out.println(a*b);
    }
    public static void carpim (int a, int b, int c){
        System.out.println(a*b*c);
    }
    public static void toplam(int... sayi){


        }

    }




package day09_ForLoopMetotOlusturma;

public class C05_NestedForLooop {
    public static void main(String[] args) {


     /*
            Kullanicidan bir sayi alip
            asagidaki sekli olusturun

            or : sayi 4
            1 2 3 4
            2 4 6 8
            3 6 9 12
            4 8 12 16
         */

       
        for (int i = 1; i<=4 ; i++) {

            System.out.print(i  + " ");
        }
        System.out.println("");

        for (int i = 1; i <=4; i++) {
            System.out.print(i * 2 + " ");
        }
        System.out.println("");
            for (int i = 1; i <=4; i++) {
                System.out.print(i * 3 + " ");
            }
        System.out.println("");
                for (int i = 1; i <=4; i++) {
                    System.out.print(i*4 + " ");
        }
        System.out.println("");
}
}
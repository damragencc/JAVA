package day14_Arrays;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayLıst {
    public static void main(String[] args) {

        // ArrayList Arrray altyapısını kullanır
        // ama ekleme ve silme yapmaya müsade eder.
        // yani esnek yapıdaki bir array gibidir.

       List<Integer> sayilar = new ArrayList<>(); // Type argumen cannot be of primitive type

        System.out.println(sayilar); // []
        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(3);

        System.out.println(sayilar);

        // 5 ile 8 in arasına 4 ekleyelim
        sayilar.add(1,4);
        System.out.println(sayilar);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        System.out.println(list2); // [10,20]

        sayilar.addAll(list2);
        System.out.println(sayilar); // 5,4,8,3,10,20

        sayilar.addAll(0,list2);
        System.out.println(sayilar); // 10,20,5,4,8,3,10,20



    }
}

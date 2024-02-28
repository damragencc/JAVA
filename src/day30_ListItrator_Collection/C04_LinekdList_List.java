package day30_ListItrator_Collection;

import java.util.LinkedList;
import java.util.List;

public class C04_LinekdList_List {
    public static void main(String[] args) {

        List<Integer> sayilar = new LinkedList<>();

        System.out.println(sayilar.hashCode());

        sayilar.add(10);
        sayilar.add(20);

        System.out.println(sayilar.hashCode()); //1291
    }
}

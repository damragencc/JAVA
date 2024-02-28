package day26_pollymorphism_abstraction;

import day25_intellianceDatatypeKullanımı.C02_Kuslar;
import day25_intellianceDatatypeKullanımı.C03_AvcıKuslar;

public class C01_Pollmorfhism {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.substring(3)); // a Jandir

        System.out.println(str.substring(3, 6)); // a C


        C03_AvcıKuslar kartal1 = new C03_AvcıKuslar();
      //  System.out.println(kartal1.beslenme); // et yerler

       C02_Kuslar kartal2 = new C03_AvcıKuslar();
      //  System.out.println(kartal2.beslenme); // beslenirler
    }

}

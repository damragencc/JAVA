package day13_Arrey;

import java.util.Arrays;

public class C08_StringSplitMetodu {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        System.out.println(Arrays.toString(str.split(",")));
        System.out.println(Arrays.toString(str.split("at")));
        //[Ali topu , , , Ali]

        System.out.println(Arrays.toString(str.split("a")));
        //[Ali topu ,t, t Ali ,t]


    }
}

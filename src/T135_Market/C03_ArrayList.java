package T135_Market;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_ArrayList {
    /*
     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir program yaziniz
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    public static void main(String[] args) {

        ArrayList<String>listIsımler=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        ArrayList<String>list2=new ArrayList<>();
        for (String a:listIsımler){

            if (!a.toLowerCase().contains("a")){
                list2.add(a);

            }

        }
        System.out.println(list2);


        }

        }




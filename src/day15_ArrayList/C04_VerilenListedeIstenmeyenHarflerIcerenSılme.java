package day15_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.List;


public class    C04_VerilenListedeIstenmeyenHarflerIcerenSılme {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Can","Kemal","Ayse","Cemre"));
        System.out.println(isimler);

        String istenmeyenHarf ="e";

        for (int i = 0; i <isimler.size() ; i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(isimler.get(i));
                i--;
            }

        }

        System.out.println(isimler); //Ali,Veli,Can,Ayse

    }
    }





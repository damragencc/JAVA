package day23_encapsulatıon_inheritance;

public class C10_Runner {
    public static void main(String[] args) {

        C09_Corolla corolla = new C09_Corolla();
        System.out.println(corolla.marka); // Toyota
        System.out.println(corolla.model); //Corolla
        System.out.println(corolla.motor); // Toyota cevreci motor kullanır
        System.out.println(corolla.sanzuman); //multidrive
        System.out.println(corolla.kasa); //kasa belirtirmedi
        System.out.println(corolla.lastik); // Turk pirellisi
        System.out.println(corolla.guvenlik); //Toyota guvenlik standardi uygulanir
        System.out.println(corolla.cekis); //Toyora araclar onden cekislidir
        System.out.println(corolla.uretimYeri); // turkite
        System.out.println(corolla.fren); // abs
        System.out.println(corolla.aku); //Inci aku


    }
}

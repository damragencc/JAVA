package Day16_ForEachLoop;

public class C02_KarelerinToplamı {
    public static void main(String[] args) {
        
        
        
        
        int [] sayilar ={1,3,2,3,2,3,1,4,3,2};
        int karelerinTOplamı = 0;

        for (int each : sayilar
             ) {

            karelerinTOplamı += each*each;
        }
        System.out.println("Arraydeki sayıların toplamı : " +karelerinTOplamı);
    }
}

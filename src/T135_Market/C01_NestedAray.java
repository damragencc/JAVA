package T135_Market;

public class C01_NestedAray {
    /*
     * verilen bir int Arrayde toplamlari istenen degere esit olan sayi ciftlerini
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */
    public static void main(String[] args) {

        int[] arr = {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

ıstenenToplamıYazdır(arr,istenenToplam);

    }

    public static void ıstenenToplamıYazdır(int[] arr, int istenenToplam){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i] +arr[j]==istenenToplam){
                    System.out.println(arr[i] + " + " +arr[j]+ " = "+istenenToplam);
                }

            }

        }
    }

}

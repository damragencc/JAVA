package T135_Market;

public class C02_NstedArray {
    //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
    // input : 1,2,-3,4,-5,-6
    //output :-1,-2,3,-4,5,6
    public static void main(String[] args) {
        int [] arr = {1,2,-3,4,-5,-6};
        for (int i = 0; i <arr.length ; i++) {

            arr[i]*=-1;

        }
        System.out.println(arr.length);



    }




    }



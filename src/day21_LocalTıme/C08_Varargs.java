package day21_LocalTıme;

public class C08_Varargs {
    public static void main(String[] args) {

        islem(3,"Ali ve Veli"); // 6
      islem(5,"A","V","K"); //5*3 =>15
      islem(4); // 0





    }
    public static void islem(int a,String... b){

        System.out.println(a*b.length);
    }
}

package day22_StringBuilder;

public class C03_AccessModifier {

    /*
    Javadaki her class uyesının MUTLAKA access modiferi OLMALIDIR
    eger bir class uyesine access modifier yazilmazsa
    Java o class uyesine default access modifier atar.
    default access modifier gorunur sekilde YAZILMAZ
     */

    public int sayiPri=10;

    int sayiDef =25;
    protected int sayiPro=30;
    public int sayiPub=20;

    public static void main(String[] args) {

    }

    private void methodPri(){
        System.out.println("Private method calisti");
    }
    void methodDef() {
        System.out.println("Private method calisti");
    }
    protected void methodPro(){
        System.out.println("Private method calisti");
    }

    public void methodPub() {
    }
}





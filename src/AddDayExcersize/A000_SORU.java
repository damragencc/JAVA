package AddDayExcersize;

public class A000_SORU {

    String musteriAdi;
    String musteriSoyAdi;
    String epostaAdresi;

    String telefonNo;

    /*
    Bir müşteri sınıfı oluşturun ve bu sınıf içinde müşteri adı, soyadı,
      e-posta adresi ve telefon numarasını temsil eden özellikler (fields) olsun.
    Parametresiz bir constructor ile müşteri nesnesi oluşturulduğunda
    bu özellikler varsayılan değerlere sahip olsun. Ayrıca,
    parametreli bir constructor ile müşteri bilgilerini
   belirli değerlere göre set edebilmek için gerekli metotları ekleyin.
    Müşteri sınıfının bir örneğini oluşturun,
      hem parametresiz constructor'ı hem de parametreli
    'ı kullanarak müşteri bilgilerini ekrana yazdırın.

     */



    public static void main(String[] args) {
        A000_SORU kullanici2 = new A000_SORU("Damra", "Genc", "damra.genc@", "05555555555");
        A000_SORU kullanici1 = new A000_SORU();

        System.out.println(kullanici2.musteriAdi +" "+ kullanici2.musteriSoyAdi +" "+ kullanici2.epostaAdresi +" "+ kullanici2.telefonNo);
        System.out.println(kullanici1.musteriAdi + " "+ kullanici1.musteriSoyAdi + " "+ kullanici1.epostaAdresi + " "+kullanici1.telefonNo);





    }

    A000_SORU(){

    }

    A000_SORU(String musteriAdı, String musteriSoyadi, String musteriEposta, String telNo){


    this.musteriAdi= musteriAdı;
    this.musteriSoyAdi   = musteriSoyadi;
      this.epostaAdresi=musteriSoyadi;
      this.telefonNo=telNo;



    }



    }















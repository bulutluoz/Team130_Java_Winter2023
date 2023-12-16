package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        String dosyaYolu = "src/day40_exceptions/yazim.txt";

        // Java'da bilgisayarimizda varolan bir dosyaya ulasmak icin
        // FileInputStream class'i kullanilir


        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);

        } catch (FileNotFoundException e) {

            System.out.println("Yazdiginiz dosya yolu yanlis");
        }

        /* Unhandled exception: java.io.FileNotFoundException
           java bir dosyaya ulasmasini istedigimizde
           o dosyaya ulasabileceginden emin olmak ister
           ve bizi bu konuda bir eylem yapmaya zorlamak icin
           kodun altini kirmizi cizer

           kodun altini kirmizi cizmesini,
           bugune kadar hep kodda hata var duzeltmemiz lazim diye yorumlamistik

           Ancak checked exception'larda
           java riski gorur ve onlem almamiz icin altini kirmizi cizer

           Java'da dosyadan bilgi alma veya dosyaya bilgi yazdirma (Input / Output IO)
           ile ilgili exception'lar checked exception'lardir
           yani daha compile aninda Java bu riskleri farkeder
           ve bizden cozum ister

         */



        /*
            Checked Exception'lar icin
            Java bize 2 alternatif sunar
            1- su ana kadar yaptigimiz gibi
               try-catch ile sarmalayip
               sorun olussa bile calismaya devam etmesini saglayabiliriz

            2- EGER exception'i kontrol altina alip
               calismaya devam etmesini istemiyorsaniz
               SADECE kirmizi cizgiyi yoketmek
               kodlarimizi calisir hale getirmek
               ve exception olusursa, kodlarimizin calismayi durdurmasini istersek
               method deklarasyonuna riskin farkinda oldugumuzu beyan eden
               throws keyword yazmamiz yeterlidir

               throws FileNotFoundException :
               method deklarasyonuna ekledigimiz bu bolum
               riskin farkinda oldugumuzu soyler
               AMMA exception'i kontrol altina almaz

         */
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);


    }
}

package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CokluCheckedException {

    public static void main(String[] args)   {

        String dosyaYolu = "src/day40_exceptions/yazi.txt";

        try {

            FileInputStream fis = new FileInputStream(dosyaYolu); // dosyaya ulasma

            int k=0;
            while((k= fis.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Yazilan dosya yolunda sorun var");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata olustu");
        } catch (Exception e) {
            System.out.println("Ongorulemeyen bir exception olustu");
        }


    }
}

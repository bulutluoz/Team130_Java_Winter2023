package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListOlusturtma {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
        //        bir method olusturun.

        System.out.println(listeOlustur());

    }


    public static List<String> listeOlustur(){

        Scanner scanner = new Scanner(System.in);
        List<String> girilenIsimlerListesi = new ArrayList<>();
        String girilenIsim = "";

        while (!girilenIsim.toUpperCase().equals("Q")){

            System.out.println("Lutfen listeye eklenecek isim girin\nbitirmek icin Q'ya basin");

            girilenIsim = scanner.nextLine(); // kullanicinin ne giris yaptigini bilmedigimiz icin
                                              // listeye eklemeden bir kere daha kontrol edelim

            if (!girilenIsim.toUpperCase().equals("Q")){
                girilenIsimlerListesi.add(girilenIsim);
            }

        }

        return girilenIsimlerListesi;
    }
}

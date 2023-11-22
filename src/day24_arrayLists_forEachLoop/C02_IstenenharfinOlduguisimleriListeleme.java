package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenenharfinOlduguisimleriListeleme {

    public static void main(String[] args) {

        // Verilen bir String array'de
        // istenen harfi iceren isimleri
        // bir Liste olarak yazdirin

        String[] isimler = {"Derya","Ismail","Sedat","Tugba","Murat","Sahil","Mehmet"};

        String istenenHarf = "l";

        List<String> uygunIsimlerListesi = new ArrayList<>();

        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].contains(istenenHarf)){

                uygunIsimlerListesi.add(isimler[i]);
            }
        }

        System.out.println("Istenen harfi iceren isimler : " + uygunIsimlerListesi);
    }
}

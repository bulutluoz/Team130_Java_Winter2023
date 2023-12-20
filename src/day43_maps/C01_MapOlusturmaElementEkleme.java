package day43_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturmaElementEkleme {

    public static void main(String[] args) {

        /*
            Bir ogrenciyi map'e eklemek icin put(key,value) kullaniriz

            bir ogrencinin value'sune ulasmak isterseniz
            - ogrenciMap.get(ogrenciNo) ile String olarak tum value'yu alip kaydederiz
            - value, pekcok bilgi barindirdigindan, her bir bilgiye ulasmak icin
               value.split("-") ile value'yu array'e ceviririz
            - array'deki tum bilgilerin index'lerine sahip oldugumuzdan
              istenen bilgileri array'den alip yazdirabilir veya kullanabiliriz



         */

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-K-MF");
        // bu ogrenci icin key : 101
        //               value : "Ali-Can-10-K-MF"
        // value String olmak zorunda degil list, array, Integer, Map, Queue

        String value101 = ogrenciMap.get(101);

        System.out.println("101'in tum bilgisi : " + value101); // Ali-Can-10-K-MF


        // 101 numarali ogrencinin soyismini yazdirin

        String[] ogrenci101BilgilerArr = value101.split("-");

        System.out.println(Arrays.toString(ogrenci101BilgilerArr));
        // [Ali, Can, 10, K, MF]


        System.out.println("101 numarali ogrenci soyismi : " + ogrenci101BilgilerArr[1]); // Can

        // 101 numarali ogrencinin bolumunu yazdirin

        System.out.println("101 numarali ogrenci bolumu : " + ogrenci101BilgilerArr[4]); // MF

        // 101 numarali ogrencinin isim ve soyismini yazdirin

        System.out.println("101 numarali ogrencinin isim ve soyismi : " +
                            ogrenci101BilgilerArr[0]+ " "+ ogrenci101BilgilerArr[1]); // Ali Can


        // 101 numarali ogrencinin isim ve soyismini yazdirin, soyisim buyuk harf olarak yazdirilsin

        System.out.println("101 numarali ogrencinin isim ve soyismi : " +
                ogrenci101BilgilerArr[0]+ " "+ ogrenci101BilgilerArr[1].toUpperCase()); // Ali CAN

    }
}

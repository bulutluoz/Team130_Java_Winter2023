package day30_timeDate_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat); // 2023-11-30T19:00:33.351015

        /*
            LocalDateTime objesi hem tarihi, hem de zamani bize getirir
            ANCAK tarih ve zamani bizim istedigimiz formatta yazdirmaz
            EGER tarih ve/veya zamani istediginiz bir formatta yazdirmak isterseniz
            DateTimeFormatter class'indan yardim almalisiniz

            03-12-2023
            3- Aralik-2023
            5 - Mar - 23
            17 / 03 / 2023


		 format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 a yazarsak AM veya PM degerini yazar

		 */


        DateTimeFormatter istedigimFormat1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(tarihSaat.format(istedigimFormat1)); // 30-11-2023

        // 15 Mart 23 Pazartesi 05 : 12 PM

        DateTimeFormatter istedigimFormat2 = DateTimeFormatter
                                               .ofPattern("dd MMMM yy EEEE hh : mm a");

        System.out.println(tarihSaat.format(istedigimFormat2)); // 30 November 23 Thursday 07 : 19 PM


        // 11/30/2023 1:35

        DateTimeFormatter istedigimFormat3 = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm");
        System.out.println(tarihSaat.format(istedigimFormat3)); // 11/30/2023 7:40

        //


    }
}

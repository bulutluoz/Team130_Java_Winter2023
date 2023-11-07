package day13_forLoop;

public class C02_ForLoop {

    public static void main(String[] args) {

        // 60 ve 23 dahil olmak uzere
        // 7 ile bolunebilen sayilari 60'dan geriye dogru yazdirin

        for (int i = 60; i >= 23 ; i--) {

            if (i % 7 == 0){
                System.out.print(i + " ");
            }

        }

        System.out.println("");

        // 3 basamakli pozitif tum tamsayilari toplayip, sonucu yazdirin

        int toplam = 0;

        for (int i = 100; i <1000 ; i++) {

            toplam += i;
        }

        System.out.println("Sayilarin toplami : " + toplam);

        // -1000 ile +1000 (sinirlar dahil)arasindaki tum tamsayilari toplayin

        toplam=0;

        for (int i = -1000; i <=1000 ; i++) {

            toplam += i;
        }

        System.out.println("-1000 ve 1000 arasindaki sayilarin toplami : " + toplam);

    }
}

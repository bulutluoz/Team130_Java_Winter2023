package day13_forLoop;

import java.util.Scanner;

public class C06_ForLoop {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degeri icin pozitif tamsayilar girin");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();

        int toplam = 0;



        if (baslangic < bitis){

            for (int i = baslangic; i <=bitis ; i++) {
                toplam +=i;
            }

        }else { // bitis < baslangic

            for (int i = bitis; i <=baslangic ; i++) {
                toplam += i ;
            }
        }

        System.out.println("Girilen sayilarin arasindaki tum sayilarin toplami : " + toplam);
    }
}

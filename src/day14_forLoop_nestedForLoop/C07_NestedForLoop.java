package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C07_NestedForLoop {

    public static void main(String[] args) {

        /*

            Kullanicidan satir ve sutun sayisini alip
            asagidaki sekilde tablo olusturun

            2 3 4 5 6
            3 4 5 6 7
            4 5 6 7 8
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Her satirda kac sayi olacagini giriniz");
        int sutun = scanner.nextInt();


        for (int i = 1; i <=satir; i++) { // satirlari

            for (int j = 1; j <=sutun ; j++) { // her satirdaki sutunlari

                System.out.print(i+j + " ");

            }
            System.out.println("");
        }
    }
}

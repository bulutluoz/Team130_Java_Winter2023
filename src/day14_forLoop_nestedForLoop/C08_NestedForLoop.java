package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C08_NestedForLoop {

    public static void main(String[] args) {

        /*

            Kullanicidan satir ve sutun sayisini alip
            asagidaki sekilde tablo olusturun

            * * * * *
            * * * * *
            * * * * *
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("satir sayisini giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Her satirda kac yildiz olacagini giriniz");
        int sutun = scanner.nextInt();


        for (int i = 1; i <=satir ; i++) { // satirlari

            for (int j = 1; j <=sutun ; j++) { // satirdaki sutunlari

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

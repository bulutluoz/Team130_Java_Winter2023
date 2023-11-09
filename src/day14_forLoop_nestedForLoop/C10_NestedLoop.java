package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C10_NestedLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan satir sayisini alip
        asagidaki sekli cizdirin

            *
            * *
            * * *
            * * * *
            * * * * *
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) { // satir

            for (int j = 1; j <=i ; j++) {// satirdaki yildiz sayisini

                System.out.print( "* ");
            }
            System.out.println("");
        }

    }
}

package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C09_NestedForLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan satir sayisini alip
        asagidaki sekli cizdirin

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satir sayisini kontrol eder
            for (int j = 1; j <=i ; j++) { // sutun sayisi da satir'a bagli
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}

package day06_ifElseStatements;

import java.util.Scanner;

public class C05_AyIsmiYazdirma2 {

    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin,
        //         harf ile baslayan bir ay varsa yazdirin.
        //         Eger girilen harf ile baslaya ay yoksa
        //         "girdiginiz harf ile baslayan ay yok" yazdirin
        //         NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //         Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scanner.next().charAt(0);

        int flag = 44;

        if (harf == 'o' || harf == 'O'){
            System.out.println("Ocak");
            flag++;
        }

        if (harf == 's' || harf == 'S'){
            System.out.println("Subat");
            flag++;
        }

        if (harf == 'm' || harf == 'M'){
            System.out.println("Mart veya Mayis");
            flag++;
        }

        if (harf == 'n' || harf == 'N'){
            System.out.println("Nisan");
            flag++;
        }

        if (harf == 'h' || harf == 'H'){
            System.out.println("Haziran");
            flag++;
        }

        if (harf == 't' || harf == 'T'){
            System.out.println("Temmuz");
            flag++;
        }

        if (harf == 'a' || harf == 'A'){
            System.out.println("Agustos veya Aralik");
            flag++;
        }

        if (harf == 'e' || harf == 'E'){
            System.out.println("Eylul veya Ekim");
            flag++;
        }

        if (harf == 'k' || harf == 'K'){
            System.out.println("Kasim");
            flag++;
        }


        if (flag == 44){
            System.out.println("girdiginiz harf ile baslayan ay yok");
        }
    }
}

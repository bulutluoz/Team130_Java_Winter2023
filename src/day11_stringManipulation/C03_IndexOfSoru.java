package day11_stringManipulation;

import java.util.Scanner;

public class C03_IndexOfSoru {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve cumlede aranacak metin isteyin
        // cumle ve metni karsilastirip
        // asagidaki 3 durumdan birini yazdirin
        // 1- verilen metin cumlede kullanilmamis
        // 2- verilen metin cumlede sadece 1 kere kullanilmis
        // 3- verilen metin cumlede 1'den fazla kere kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aranacak metni giriniz");
        String metin = scanner.nextLine();

        if (!cumle.contains(metin)){
            System.out.println("verilen metin cumlede kullanilmamis");
        } else if (cumle.indexOf(metin) == cumle.lastIndexOf(metin)) {
            System.out.println("verilen metin cumlede sadece 1 kere kullanilmis");
        }else{
            System.out.println("verilen metin cumlede 1'den fazla kere kullanilmis");
        }

    }
}

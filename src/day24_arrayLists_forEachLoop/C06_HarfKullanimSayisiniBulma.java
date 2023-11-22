package day24_arrayLists_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_HarfKullanimSayisiniBulma {

    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //        case sensitive olmadan,
        //        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Aranacak harfi girin");
        String harf = scanner.next().substring(0,1);

        /*
            cumledeki herbir harfe iki turlu ulasabiliriz
            1- for-loop ve substring ile
            2- split ile array'e cevirip, for-each loop ile
         */

        String[] cumleHarfArrayi = cumle.split("");
        // [A, l, i,  , t, o, p, u,  , t, u, t, ,,  , t, u, t,  , a, l, i,  , t, u, t]

       int sayac =0;

        for (String each : cumleHarfArrayi
             ) {
            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }

        }

        if (sayac == 0 ) {
            System.out.println("harf cumlede kullanilmamis");
        }else{
            System.out.println("Verilen harf cumlede " + sayac + " defa kullanilmis");
        }

    }
}

package day29_immutableClasses;

import java.util.Scanner;

public class C01_PassByValueVariable {


    public static void main(String[] args) {
        // bir method yapip, verilen sayinin karesini dondurun

        int sayi = 11;

        System.out.println(getSquare(sayi));


        // verilen sayinin kupunu donduren bir method olusturun
        // main method'da kullanicidan bir deger alip, kupunu hesaplatalim
        // ve yeni degeri kullanicidan alinan deger olarak kaydedelim

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        girilenSayi = getCube(girilenSayi);


    }

    public static int getCube(int girilenSayi){

        girilenSayi = girilenSayi*girilenSayi*girilenSayi ;

        return girilenSayi;
    }

    public static int getSquare(int a){

        return a*a ;
    }

}

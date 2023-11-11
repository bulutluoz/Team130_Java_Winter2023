package day16_methodOlusturma_methodOverloading;

public class C05_MethodOverloading {

    public static void main(String[] args) {

        // verilen iki sayiyi toplayip, sonucu yazdiran bir method olusturun

        toplaYazdir(5,7); // iki int'in toplami : 12
        toplaYazdir(7.4,6); // double ve int'in toplami : 13.4
        toplaYazdir("Ali",5); // String ve int'in toplami : Ali5

        // toplaYazdir(5,5.3); // Cannot resolve method 'toplaYazdir(int, double)'

        toplaYazdir('4','a'); // iki int'in toplami : 149
        // toplaYazdir(char, char) yok ama
        // char ascii sayesinde int'a donusebildigi icin
        // toplaYazdir(int, int) method'u kullanilabilir

        toplaYazdir(3.5f ,5); // double ve int'in toplami : 8.5
        // float double degildir ama auto widening ile
        // double bir degiskene float deger atayabiliriz

    }

    public static void toplaYazdir(int sayi1, int sayi2){

        System.out.println("iki int'in toplami : " + (sayi1+sayi2));
    }
    // parametre isimlerini degistirerek, ayni method'u 2 kere olusturabilir miyiz ?
    //'toplaYazdir(int, int)' is already defined in 'day16_methodOlusturma_methodOverloading.C05_MethodOverloading'
    // Java parametrelerin adina degil, data turune bakiyor
    // yukardaki method toplayazdir(int, int) varken yenisini olusturamazsiniz

    /*
        Java'da method ismi ve parametrelerin data turleri birlikte dusunuldugunde
        ortaya cikan metne METHOD SIGNATURE denir
        toplayazdir(int, int)

        Java method'lardaki parametre isimlerine degil
        method signature'ina bakar
        ayni method signature'ina sahip birden fazla method olusturmaniza IZIN VERMEZ
     */

    public static void toplaYazdir(double a, int b){

        System.out.println("double ve int'in toplami : " + (a+b));
    }

    public static void toplaYazdir(String a, int b){

        System.out.println("String ve int'in toplami : " + (a+b));
    }
}

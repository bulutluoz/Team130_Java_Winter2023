package day40_exceptions;

public class C04_BaziExceptionTurleri {

    public static void main(String[] args) {

        // 1- NullPointerException
        // null olarak isaretlenen bir String
        // method ile kullanilirsa olusur

        String str=null;

        System.out.println(str); // null
        System.out.println(str + 555); // null555

        // System.out.println(str.concat("555")); // NullPointerException

        // System.out.println(str.substring(1)); // NullPointerException


        // 2- StringIndexOutOfException
        //    verilen String'de sinirlarin disinda index kullanilirsa

        str = "Java candir";

        // System.out.println(str.substring(15, 18)); // StringIndexOutOfBoundsException

        // 3 - ArrayIndexOutOfBounds Exception
        //     verilen array'de sinirlarin disinda index kullanilirsa


        // 4- NumberFormatException
        //    icinde sayi olmayan karakter barindiran bir String
        //    Integer'a parse edilmeye calisilirsa

        str = "12"; // "12*"

        // String olarak verilen sayinin karesini yazdirin

        System.out.println(Integer.parseInt(str) * Integer.parseInt(str)); // 144


        // 5- ClassCastException cast edilmesi mumkun olmayan bir degeri
        //    object uzerinden bir variable'a atamak isteyince olusur

        Integer integer = 6;
        Object object = "sedat"  ; // integer
        String string = (String) object;

        System.out.println(string); // sedat
    }
}

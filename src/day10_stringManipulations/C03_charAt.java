package day10_stringManipulations;

public class C03_charAt {

    public static void main(String[] args) {

        String str = "Java Candir";

        // ilk harfi yazdirin

        System.out.println(str.charAt(0)); // J

        System.out.println(str.charAt(7)); // n

        // son harfi yazdirin

        System.out.println(str.charAt(10)); // r
        System.out.println(str.charAt(11-1)); // r
        System.out.println(str.charAt(str.length()-1)); // r
        // Eger bir kod yazarken
        // verilen input'taki degisimleri algilasin ve
        // yeni haline gore isteneni yapsin istiyorsak
        // dinamik kod yazmaliyiz
        // bunun icin elle yazacagimiz index degerleri yerine
        // metnin length'ini kullanabiliriz

        System.out.println(str.length()); // 11

        // sondan 3.harfi yazdirin
        System.out.println(str.charAt(str.length() - 3)); // d

        // olmayan bir index kullanirsak

        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException


        // System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException


    }
}

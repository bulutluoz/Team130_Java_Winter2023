package day10_stringManipulations;

public class C04_substring {
    public static void main(String[] args) {

       String str = "Java Candir";

       // String'de iki farkli yontemle substring elde edebiliriz
       // 1- tek parametre yazarsak

        System.out.println(str.substring(3)); // a Candir
        System.out.println(str.substring(0)); // Java Candir
        System.out.println(str.substring(9)); // ir

        // son 3 karkteri yazdirin
        System.out.println(str.substring(8)); // dir
        // dinamik olmasi icin length'i kullanarak yazalim
        System.out.println(str.substring(str.length()-3)); // dir

        // System.out.println(str.substring(20)); // StringIndexOutOfBoundsException
        System.out.println(str.substring(str.length())); // bos bir satir
        System.out.println("--");

        //System.out.println(str.substring(str.length()+1));
        //StringIndexOutOfBoundsException

        // 2- iki parametre yazarsak
        //    ilk parametreye esit olan index'den baslar
        //    ikinci parametreye esit olan index'e kadar yazdiri
        //    (ilk index dahik - ikinci index dahil degil)


        //  "Java Candir";

        System.out.println(str.substring(1, 6));// ava C
        System.out.println(str.substring(0,7)); // Java Ca

        System.out.println(str.substring(1,2)); // a

        // 7.index'deki elemani yazdirin
        System.out.println(str.charAt(7)); // n
        System.out.println(str.substring(7,8)); // n

        // str.charAt(7).  char oldugu icin yeni method kullanilamiyor
        // str.substring(7,8). String oldugu icin method kullanabiliriz

        System.out.println(str.substring(2, 2)); // hiclik
        System.out.println("=====");

        //System.out.println(str.substring(6, 4)); // StringIndexOutOfBoundsException

        // ilk 7 karakteri yazdirin

        System.out.println(str.substring(0,7)); // Java Ca



    }
}

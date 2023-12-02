package day31_stringBuilder_accessModifier;

public class C02_StringBuilderIleStringMethodlariKullanma {

    public static void main(String[] args) {

        /*
            StringBuilder ile kullanilabilen method'lardan
            String, char gibi baska data turunden sonuc dondurenler
            StringBuilder'i kalici olarak degistirmezler
         */

        StringBuilder sb = new StringBuilder("Java candir");

        // sb'yi buyuk harflerle yazdirin

        System.out.println(sb.toString().toUpperCase()); // JAVA CANDIR

        // StringBuilder'da olmayan String ozelliklerini kullanmak istersek
        // once toString() ile String'e cevirir, sonra istedigimiz String method'unu kullanabiliriz
        // Peki bu degisiklik kalici olur mu ?

        System.out.println(sb);  // Java candir

        // Peki atama yapsak kalici olur mu ?

        // sb = sb.toString().toUpperCase();
        // farkli data turundeki non-primitive variable'lar
        // birbirine atanamaz veya birbiriyle karsilastirilamaz


        StringBuilder sb1 = new StringBuilder("Java");

        // eger sb'nin degerini buyuk harf yapip,
        // kalici olarak degistirmek istiyorsak

        sb = new StringBuilder(sb.toString().toUpperCase());

        System.out.println(sb); // JAVA CANDIR

        System.out.println(sb.substring(5)); // CANDIR return type String

        System.out.println(sb); // JAVA CANDIR

        System.out.println(sb.charAt(6)); // A  return type char

        System.out.println(sb); // JAVA CANDIR




    }
}

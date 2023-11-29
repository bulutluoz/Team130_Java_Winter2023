package day29_immutableClasses;

public class C05_StringPool {

    public static void main(String[] args) {

        /*
            Java String icin her seferinde yeniden obje olusturmamak icin
            basit bir mekanizma uretmistir

            Buna String Pool diyoruz

            Java basit sekilde olusturulan
            String ..... = ".......";
            String objeleri String Pool'da tutar

            Sonradan yine basit yontemle
            yeni bir String olusturursaniz
            once String Pool'u kontrol eder
            orada ayni degere sahip eski bir String varsa
            yeni olusturdugumuz String'e ayni referans'i verir
         */


        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja" + "va";
        String s = "Ja";
        String t = "va";
        String str5 = s.concat(t);

        // == hem referans'a hem metne bakar, ikisi de ayni ise true verir, yoksa false
        System.out.println(str1 == str2 ); // true
        System.out.println(str1 == str3 ); // false
        System.out.println(str1 == str4 ); // true
        System.out.println(str1 == str5 ); // false
        System.out.println(str1 == "Java" ); // true

        // equals() sadece metne bakar
        System.out.println("====================");
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals("Java")); // true
    }
}

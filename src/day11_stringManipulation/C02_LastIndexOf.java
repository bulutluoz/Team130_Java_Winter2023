package day11_stringManipulation;

public class C02_LastIndexOf {

    public static void main(String[] args) {

        String str = "Bu Java ogrenilecek";

        // e'nin ilk kullaniminin index'ini yazdirin

        System.out.println(str.indexOf('e')); // 11

        // e'nin son kullaniminin index'ini yazdirin

        System.out.println(str.lastIndexOf("e")); // 17


        // u'nun ilk kullanim ve son kullanim index'lerini yazdirin

        System.out.println("ilk index : "+  str.indexOf("u")); // 1
        System.out.println("son index : " + str.lastIndexOf("u")); // 1


        // J harfinin bu metin'de hic kullanilmadigini
        // veya sadece 1 kere kullanildigini yazdirin

        if (str.indexOf('J') == -1){
            System.out.println("Metinde J hic yok");
        } else if (str.indexOf("J") == str.lastIndexOf("J")) {
            System.out.println("Metinde J sadece 1 kere kullanilmis");
        }

        // "Bu Java ogrenilecek";
        System.out.println(str.lastIndexOf("e", 15)); // 15
        System.out.println(str.lastIndexOf("e", 14)); // 11

        System.out.println(str.lastIndexOf("x")); // -1
    }
}

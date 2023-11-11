package day16_methodOlusturma_methodOverloading;

public class C02_returnTypeIleMethodOlusturma {

    public static void main(String[] args) {

        // Verilen isim ve soyismi
        // istenen formata cevirip bize donduren bir method olusturun
        // ornek output :  A***** B*********

        System.out.println(ismiIstenenFormataCevir("Asli", "Nehaber"));

    }


    public static String ismiIstenenFormataCevir(String isim, String soyisim){

        String donusmusIsim = isim.substring(0,1).toUpperCase()
                            + isim.substring(1).replaceAll("\\w","*") +
                            " " +
                            soyisim.substring(0,1).toUpperCase()
                            + soyisim.substring(1).replaceAll("\\w","*");


        return donusmusIsim;

        // System.out.println("burasi calismaz"); // Unreachable statement
    }
}

package day12_stringManipulations;

public class C02_ReplaceAll {

    public static void main(String[] args) {

        String str = "J1a34va12 C87an90d654ir";

        // metinden tum sayilari temizleyip
        // metni kaydedin

        // ReplaceAll tek tek harfleri, rakamlari degil
        // tum harfleri, yada tum rakamlari diyebilecegimiz durumlarda kullanilir

        // ornegin bu soruda "tum sayilari yok etmemiz" lazim

        str = str.replaceAll("\\d","");

        System.out.println(str);





    }
}

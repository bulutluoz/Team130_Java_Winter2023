package day08_nestedIfElseStatements;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
            Ternary if-else'in alternatifi degildir
            Sadece basit islemlerde if-else'in yerine tercih edilebilir

            ternary bir sonuc uretir
            Java tek basina ternary'nin sonucunu ne yapacagini bilemez
            YAZDIRMA veya ATAMA yapmalisiniz

            EGER boolean sart true oldugunda elde edilen sonuc ile
            false oldugunda elde edilen sonuc farkli data turlerine sahipse
            bir variable'a atama yapamazsiniz
            sadece yazdirabilirsiniz
         */

        int input  = 24;

        // iki basamakli mi ?
        // iki basamakli ise sayiyi 2 katina cikarin
        // iki basamakli degilse "iki basamakli degil" yazdirin

        // String sonuc = input>=10 && input<=99 ? input*2 : "iki basamakli degil" ;
        System.out.println(input>=10 && input<=99 ? input = input*2 : "iki basamakli degil");

        System.out.println("input'un son hali : "+input);
    }
}

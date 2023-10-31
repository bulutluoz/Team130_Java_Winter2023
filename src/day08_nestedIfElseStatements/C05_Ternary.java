package day08_nestedIfElseStatements;

public class C05_Ternary {

    public static void main(String[] args) {

        // input olarak verilen bir tamsayi icin
        // pozitif veya pozitif degil yazdirin
        int input = 15;

        if (input>0){
            System.out.println("sayi pozitif");
        }else{
            System.out.println("sayi pozitif degil");
        }

        System.out.println( input>0 ? "sayi pozitif" : "sayi pozitif degil" );



        // input olarak verilen sayi
        // cift sayi ise 2 katina cikartin
        // tek sayi ise degerini 5 artirin

        input = input % 2 == 0 ? input*2 : input+5 ;

        System.out.println(input);


        if (input % 2 == 0 ){
            input *= 2;
        }else{
            input +=5;
        }



    }
}

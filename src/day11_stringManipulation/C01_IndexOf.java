package day11_stringManipulation;

public class C01_IndexOf {

    public static void main(String[] args) {

        String str = "Java cok guzel bir programlama dili.";

        System.out.println(str.contains("a")); // true

        System.out.println(str.indexOf("a")); // 1

        System.out.println(str.indexOf('c')); // 5

        System.out.println(str.charAt(5)); // c

        System.out.println(str.indexOf("a ")); // 3

        System.out.println(str.indexOf("guzel")); // 9

        System.out.println(str.indexOf(" ")); // 4

        System.out.println(str.indexOf(" ", 10)); // 14

        // ikinci space'in index'ini yazdirin

        System.out.println(str.indexOf(" ", 4+1));

        // ikinci i'nin index'ini yazdirin

        System.out.println(str.indexOf("i")); // 16

        System.out.println(str.indexOf("i", str.indexOf("i") + 1)); // 32

        // ikinci a'nin index'ini yazdirin

        System.out.println(str.indexOf("a", str.indexOf("a") + 1)); // 3

        // olmayan bir String'in index'ini istersek

        System.out.println(str.indexOf("x")); // -1
        System.out.println(str.indexOf("Phyton")); // -1


        // ikinci c olup olmadigini yazdirin

        int ilkCindex= str.indexOf("c");

        if (ilkCindex == -1){
            System.out.println("verilen metinde c yok");
        }else if (str.indexOf("c",ilkCindex+1) == -1){
            System.out.println("2.c yok");
        }else{
            System.out.println("2.c var");
        }



    }
}

package day31_stringBuilder_accessModifier;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.capacity()); // 27
        System.out.println(sb1.length()); // 11

        sb1.append(", bundan suphe eden mi var ?");

        System.out.println(sb1); // Java Candir, bundan suphe eden mi var ?
                                 // StringBuilder mutable oldugundan
                                 // method ile yapilan degisiklikler kalici olur

        System.out.println(sb1.capacity()); // 56
        System.out.println(sb1.length()); // 39

        // capacity ve length'i esitlemek isterseniz

        sb1.trimToSize();
        System.out.println(sb1.capacity()); // 39
        System.out.println(sb1.length()); // 39

        String str = "Hava cok guzel";

        sb1.append(str,5,9);
        // sb1'in sonuna str'in belirtilen araligindaki karakterleri ekler

        System.out.println(sb1); // Java Candir, bundan suphe eden mi var ?cok

        sb1.insert(5,"niye bu kadar ");
        // sb'in istenen yerine , verilen String'i insert eder

        System.out.println(sb1); // Java niye bu kadar Candir, bundan suphe eden mi var ?cok

        sb1.insert(18,str,4,8); // 18.index'e str'in istenen parcasini insert eder

        System.out.println(sb1); // Java niye bu kadar cok Candir, bundan suphe eden mi var ?cok

        sb1.delete(5,10);

        System.out.println(sb1); // Java bu kadar cok Candir, bundan suphe eden mi var ?cok

        sb1.deleteCharAt(54);

        System.out.println(sb1); // Java bu kadar cok Candir, bundan suphe eden mi var ?co

        sb1.delete(52,55);

        System.out.println(sb1); // Java bu kadar cok Candir, bundan suphe eden mi var ?

        // bu cumleyi terse cevirin

        System.out.println(sb1.reverse());

        // ? rav im nede ehpus nadnub ,ridnaC koc radak ub avaJ

        System.out.println(sb1); // ? rav im nede ehpus nadnub ,ridnaC koc radak ub avaJ

         sb1.reverse();

        // StringBuilder mutable oldugundan,
        // sout'un icinde bile yaptigimiz degisiklikler kalici olur

        sb1.replace(24,52,"");

        System.out.println(sb1); //Java bu kadar cok Candir





    }
}

package day32_encapsulation;

import day31_stringBuilder_accessModifier.C04_AccessModifier;

public class C02_ChildOlmayanClass {

    public static void main(String[] args) {

        C04_AccessModifier obj = new C04_AccessModifier();
        // System.out.println(obj.strPrivate); sadece ayni class'dakiler
        // System.out.println(obj.sayiDefault); sadece ayni package'dakiler
        // System.out.println(obj.blProtected); child class'lar
        obj.methodPublic();
    }
}

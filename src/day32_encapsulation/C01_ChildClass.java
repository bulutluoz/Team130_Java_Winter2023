package day32_encapsulation;

import day31_stringBuilder_accessModifier.C04_AccessModifier;

public class C01_ChildClass extends C04_AccessModifier {
    // extends keyword icinde bulundugumuz C01 class'ini
    // C04_AccessModifier class'inin child'i yapar

    public static void main(String[] args) {

        C04_AccessModifier obj = new C04_AccessModifier();
        // System.out.println(obj.strPrivate); sadece kendi class'i
        // System.out.println(obj.sayiDefault); kendi package'i // diger adi package private'dir
        // System.out.println(obj.blProtected);
        obj.methodPublic();

        C01_ChildClass objChild = new C01_ChildClass();
        System.out.println(objChild.blProtected);
        objChild.blProtected=true;

    }

}

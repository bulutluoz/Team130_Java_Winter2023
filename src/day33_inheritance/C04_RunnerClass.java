package day33_inheritance;

public class C04_RunnerClass {

    public static void main(String[] args) {

        C03_DizelCorolla dc1 = new C03_DizelCorolla();

        System.out.println(dc1.sanzuman); // Belirtilmemis A

        System.out.println(dc1.marka); // Toyota T
        System.out.println(dc1.guvenlik); // extra T

        System.out.println(dc1.model); // Corolla DC
        System.out.println(dc1.motor); // dizel DC
        System.out.println(dc1.yakit); // dizel DC
        System.out.println(dc1.uretimYeri); // Sakarya DC
        System.out.println(dc1.aku); // Inci DC
        System.out.println(dc1.teker); // pirelli 15 DC
        System.out.println(dc1.renk); // renk belirtilmemis DC
        System.out.println(dc1.fren); // abs DC

    }
}

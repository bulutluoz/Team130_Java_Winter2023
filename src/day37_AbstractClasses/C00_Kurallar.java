package day37_AbstractClasses;

public class C00_Kurallar {

        /*

        KURAL 1 :
          Bir abstract class'i parent edinen
          abstract olmayan(concrete) bir child class
          parent class'da abstract olarak olusturulan
          tum method'lari
          kendisine IMPLEMENT etmek ZORUNDADIR

          parent class'daki concrete method'lar icin
          boyle bir mecburiyet YOKTUR

        KURAL 2 :
          Bir abstract class abstract ve/veya concret method'lar barindirabilir
          Bir concret class ise abstract method BARINDIRAMAZ

        KURAL 3 :
          Abstract bir class'i parent edinen
          ABSTRACT bir class, kendisi de abstract oldugundan
          parent class'daki abstract method'lari
          implement etmek ZORUNDA DEGILDIR

          Abstract parent - abstract child arasindaki iliski
          concrete parent - child iliskisi gibidir
          child class isterse override eder, isterse paren class'dan kullanir
       KURAL 4 :
          Abstract bir silsileden sonra gelen
          ilk CONCRETE Class
          Parent abstract class(lar)daki
          concrete'lestirilmemis olan
          tum abstract method'lari implement etmek ZORUNDADIR
       KURAL 5 :
          Abstract class'lar class olduklari icin
          constructor'a sahiptirler
          AMMA abstract class'lardan obje olusturulamaz

          Cunku abstract class'dan obje olusturursaniz
          o class'daki method'lari calistirabilmelisiniz
          ama abstract method'lar body'si olmadigindan calisamaz


     */
}

package lambdaAlistirmalar;

import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {

        System.out.println(topla(10));
        System.out.println("   ***   ");
        System.out.println(topla1(10));
        System.out.println("   ***   ");
        System.out.println(topla2(10));
        System.out.println("   ***   ");
        System.out.println(toplaCift(10));
        System.out.println("   ***   ");
        System.out.println(toplaIlkCift(10));
        System.out.println("   ***   ");
        System.out.println(toplaIlkTek(10));
        System.out.println("   ***   ");
        ikiIlkXkuvvet(7);
        System.out.println("   ***   ");
        istenenSayIlkXkuvvet(2,3);
        System.out.println("   ***   ");
        System.out.println(istenenSayiniFaktoriyeli(5));
        System.out.println("   ***   ");
        System.out.println("   ***   ");
        System.out.println("   ***   ");
    }
    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program yaziniz.

    //Structured Programming
    public static int topla(int x){
     int toplam=0;
        for (int i = 0; i <=x ; i++) {
            toplam+=i;
        }
        return toplam;
    }
    //Functional Programming
    public static int topla1(int x) {
    return IntStream.range(1,x+1).sum();
    }
    public static int topla2(int x) {
        return IntStream.rangeClosed(1,x).sum();
    }
    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program yaziniz
    public static int toplaCift(int x) {
        return IntStream.rangeClosed(1,x).filter(Lambda01::ciftBul).sum();
    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program yaziniz
    public static int toplaIlkCift(int x) {
        return IntStream.iterate(2,t->t+2).limit(x).sum();
    }
    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi yaziniz
    public static int toplaIlkTek(int x) {
        return IntStream.iterate(1,t->t+2).limit(x).sum();
    }
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi yaziniz--> 2 4 8 16
    public static void ikiIlkXkuvvet(int x) {
         IntStream.iterate(2,t->t*2).limit(x).forEach(Lambda01::printEl);
    }
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi yaziniz
    public static void istenenSayIlkXkuvvet(int a, int x) {
        IntStream.iterate(a,t->t*a).limit(x).forEach(Lambda01::printEl);
    }
    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi yaziniz
    public static OptionalInt istenenSayiniFaktoriyeli(int x) {
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact);
    }
    //Buyuk sayilarla faktoriyel...
    public static BigInteger factorialBigInteger(int a) {
        return IntStream.
                rangeClosed(1, a).
                mapToObj(BigInteger::valueOf).
                reduce(BigInteger.ONE, BigInteger::multiply);
    }
    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi yaziniz
    public static int istenenSayiniXincikuvvet(int a, int x) {
        return IntStream.iterate(a, t -> t * a).//a a^2 a^3 a^4... x elemanarinin akýsý
                limit(x).//akýsdaki ilk x elamaný verir
                reduce(0, (t, u) -> u);
        //skip(x-1);//skip den sonra cýkan elemanlarý toList ile yazdirilmali
    }


}

package lambdaAlistirmalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55));

        printElStr(list);//method call
        System.out.println();
        System.out.println("   ***   ");
        printElfunctional(list);
        System.out.println();
        System.out.println("   ***   ");
        printElfunctional1(list);
        System.out.println();
        System.out.println("   ***   ");
        printCiftElStuructured(list);
        System.out.println();
        System.out.println("   ***   ");
        printCiftElFunctional1(list);
        System.out.println();
        System.out.println("   ***   ");
        printCiftElFunctional2(list);
        System.out.println();
        System.out.println("   ***   ");
        printCiftAltmýsKucuk(list);
        System.out.println();
        System.out.println("   ***   ");
        tekYirmidenbuyukPrint(list);
        System.out.println();
        System.out.println("   ***   ");
        ciftKarePrint(list);
        System.out.println();
        System.out.println("   ***   ");
        kupBirFazlaTekFunction(list);
        System.out.println();
        System.out.println("   ***   ");
        karekokCiftfunctional(list);
        System.out.println();
        System.out.println("   ***   ");
        maxElfunction(list);


    }

    //structured Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    private static void printElStr(List<Integer> list) {
        for (Integer w : list)
            System.out.print(w + " ");

    }

    //Functional Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElfunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    public static void printEl(int t) {
        System.out.print(t + " ");
    }

    public static void printElfunctional1(List<Integer> list) {
        list.stream().forEach(Lambda01::printEl);

    }

    //structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printCiftElStuructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }
    }

    //Functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printCiftElFunctional1(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(Lambda01::printEl);
    }

    public static boolean ciftBul(int i) {//refere edilecek tohum method creATE EDÝLDÝ

        return i % 2 == 0;
    }

    public static void printCiftElFunctional2(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);

    }

    //Functional Programming ile list elemanlarinin  cift olanalrinin 60 dan kucuk olanlarýný ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printCiftAltmýsKucuk(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0 & t < 60).forEach(Lambda01::printEl);
    }

    //Functional Programming ile list elemanlarinin  tek olanalrini veya 20 dan buyuk
    // olanlarýný ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void tekYirmidenbuyukPrint(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0 || t > 20).forEach(Lambda01::printEl);
    }

    //Functional Programming ile list elemanlarinin  cift olanlarinin
    // karelerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKarePrint(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).map(t -> t * t).forEach(Lambda01::printEl);
    }

    //Functional Programming ile list elemanlarinin  tek olanlarinin
    // kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void kupBirFazlaTekFunction(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 1).map(t -> (t * t * t) + 1).forEach(Lambda01::printEl);
    }

    //Functional Programming ile list elemanlarinin  cift olanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void karekokCiftfunctional(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).map(Math::sqrt).forEach(t -> System.out.println(t + " "));
    }

    //list'in en buyuk elemanini yazdiriniz
    public static void maxElfunction(List<Integer> list) {
        Optional<Integer> maxEl = list.stream().reduce(Math::max);
        System.out.println(maxEl);
    }
}
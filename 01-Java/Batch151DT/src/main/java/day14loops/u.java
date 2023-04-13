package day14loops;

import java.util.Arrays;
import java.util.Scanner;

public class u {
    public static void main(String[] args) {


        int a[][] = new int[3][2];
        //MultiDimensional Array'lere eleman nasil eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        //MultiDimensional Array console'a nasil yazdirilir
        System.out.println(Arrays.deepToString(a));


        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(a[1][1]);//45

        //Multidimensional Array icindeki bir array nasil yazdirilir?
        System.out.println(Arrays.toString(a[0]));//[A, K]
        System.out.println(Arrays.toString(a[1]));//[P, M]
        System.out.println(a[0]);
    }
}

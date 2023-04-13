package day17multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {


    // Bir array'in elemanlari Array ise bu Array Multidimensional arraydir
        //Multidimensional array nasil olusturulur?
        int a [][] = new int [3][2];

        //MultiDimensional Arraylere eleman nasil eklenir?
        a[0][0] =5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;
        //MultiDimensional Arrayleri console yazdirmak icin deepToString() methodunu kullaniriz
        System.out.println(Arrays.toString(a));//[[I@511baa65, [I@340f438e, [I@30c7da1e]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //MultiDimensional Array icinden specific bir elemani nasil yazdirilir
        System.out.println(a[1][1]);//45

        //MultiDimensional Array icindeki array nasil yazdirilir
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[1]));//[81, 45]

        //Kisa yoldan Multidimensional array nasil olusturulur.

        String students [][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum = 0;
                                //{{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}}
        for  ( String []  w :  students   ) {
           sum = sum +w.length;
        }
        System.out.println(sum);


        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz

                             //{{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}}
        for ( String [] w : students  ) {

            for ( String k  : w) {

                if(k.contains("m")){

                    System.out.println(k);
                }
            }

        }

        //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
        int nums[][] = { {5, 4}, {2, 3, 2}, {7}};
        int result = 1;
                              //{ {5, 4}, {2, 3, 2}, {7}};
        for ( int [] w   :   nums ) {
           for ( int k  : w  ) {
               result = result*k;
            }
        }
        System.out.println(result);

    }
}

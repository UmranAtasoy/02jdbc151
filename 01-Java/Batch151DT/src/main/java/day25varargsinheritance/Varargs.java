package day25varargsinheritance;

public class Varargs {

    public static void main(String[] args) {

        System.out.println(add(3,6));
        System.out.println(add(5, 2, 7,9,15,5));

        getInitials("Ali Can","Veli Han");

    }
    //1) Bir method parantezinde birden fazla varargs kullanilamaz.
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir

    public static int add(int... a){
        int sum = 0;
        for ( int w   : a ) {
          sum =  sum+w;
        }
        return sum;
    }




    // toplama islemi yapan bir method olustur
    //Asagidaki gibi farkli methodlari olusturarak dynamic cozum üretemeyiz
    //Cunku kullanici farkli sayidaki sayilari toplamak herzaman isteyebilir
    //Her ihtimal icin bir methodu olusturmak mumkun degilidir
    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //bu yapiya Varargs denir
    //Varargs arka planda Array yapisini kullanir

//    public int add(int a, int b){
//        return a+b;
//    }
//
//    public int add(int a, int b, int c){
//        return a+b+c;
//    }
//
//    public int add(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    // Example :   Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
    //            Ali Can ==> AC    Kemal Han ==> KH

    public static void getInitials(String... s){

        String initals = "";
        for (String w : s  ) {
         initals =   initals +  w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initals);
            initals = "";
        }


    }







}

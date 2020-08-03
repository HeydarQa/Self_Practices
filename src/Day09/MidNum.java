package Day09;
/*
. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)

 */

public class MidNum {
    public static void main(String[] args) {
        double a=100;
        double b=200;
        double c=150;

        boolean Mida=(a>b&&a<c)||(a>c&&a<b);
        boolean Midb=(b<a && b>c)||(b<c&&b>a);
        boolean Midc=!Mida &&!Midb;

        String text01=" is the middle number.";
        double Mid=0;

        if(Mida){
            Mid=a;
        }
        if (Midb) {
            Mid=b;
        }
        if (Midc){
            Mid=c;
        }
        System.out.println(Mid+text01);
    }
}

package Day09;


/*
1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

 */
public class Warmup01 {
    public static void main(String[] args) {

        double a=100;
        double b=15000;
        double c=2200;
        boolean max=a>b&&a>c==true;
        boolean max1=b>a&&b>c==true;
        boolean max3=!max&&!max1; // max3=!a&&!b

        double Max=0;
        String result=" is max number.";

        if(max){
            //System.out.println(a + result);
            Max=a;
        }
        if(max1){
            //System.out.println(b + result);
            Max=b;
        }
        if (max3){
            //System.out.println(c + result);
            Max=c;
        }
        System.out.println(Max + result);

    }
}

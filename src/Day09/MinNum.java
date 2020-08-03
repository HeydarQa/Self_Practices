package Day09;
/*
2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)

 */
public class MinNum {
    public static void main(String[] args) {
        double a=100;
        double b=17;
        double c=25;
        boolean min=a<b&&a<c;
        boolean min1=!min&&b<c;
        boolean min2=!min&&!min1;

        String text1=" is min number";
        double Min=0;



        if (min){
            //System.out.println(a +" is min number." );
            Min=a;
        }
        if (min1){
           // System.out.println(b +" is min number." );
            Min=b;
        }
        if (min2){
            //System.out.println(c +" is min number." );
            Min=c;
        }
        System.out.println(Min+text1);
    }

}

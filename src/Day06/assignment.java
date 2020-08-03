package Day06;
/*
int x = 1000;
odd: x % 2 != 0  ===> false
even: x % 2 == 0 ===> true
divisible by 3:  x % 3 == 0  ===> false
divisible by 5:  x % 5 == 0  ===> true
divisible by 10: x % 10 == 0  ===> true

 */

public class assignment {
    public static void main(String[] args) {
        int x=1000;
        boolean odd=x%2!=0;
        boolean even=x%2==0;
        boolean divisibleBy_3=x%3==0;
        boolean divisibleBy_5=x%5==0;
        boolean divisibleBy_10=x%10==0;
        System.out.println("Is " +x+" odd Number ? "+odd);
        System.out.println("Is "+x+" even number ? " +even);
        System.out.println("Is "+x+" divisible by 3 ? "+divisibleBy_3);
        System.out.println("Is "+x+" divisible by 5 ? "+divisibleBy_5);
        System.out.println("Is "+x+" divisible by 10 ? "+divisibleBy_10);


    }

}

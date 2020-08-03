package Day11_NestedIF;

import javax.crypto.interfaces.PBEKey;

public class Switch {
    public static void main(String[] args) {
        int month=7;
        String result="";
        switch (month){
            case 1:
            case 3:
            case 5:
            case 10:
                result=("31 days month");
                break;
            case 7:
            case 9:
            case 11:
            case 12:
                result=("30 days month");
                break;
            case 2:
                result=("28 days month");
                break;

        default:
            System.out.println("Invalid Number");
            break;

        }
        System.out.println(result);

    }
}

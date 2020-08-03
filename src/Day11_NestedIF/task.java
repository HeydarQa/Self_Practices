package Day11_NestedIF;

public class task {
    public static void main(String[] args) {

        int age=155;
        String ageGroup="";

        if(age>0&&age<=150){
            if(age<20){
                ageGroup="Teenager";
            }else if(age<30){
                ageGroup="Adult";
            }else{
                ageGroup="Senior";
            }

        }else{
            ageGroup="Invalid number";
        }
        System.out.println(ageGroup);

    }
}

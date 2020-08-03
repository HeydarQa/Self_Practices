package Day010;

public class task001 {
    public static void main(String[] args) {
        int numberOfBedrooms = 1;
        int startingPrice = 0;

        //WRITE YOUR CODE HERE
        if(numberOfBedrooms==1){
            System.out.println("One Bedroom Selected");
            System.out.print(startingPrice==1100);
        }else if(numberOfBedrooms==2){
            System.out.println("Two Bedroom Selected");
            System.out.print(startingPrice==1850);
        }else if(numberOfBedrooms==3){
            System.out.println("Three Bedroom Selected");
            System.out.print(startingPrice==2550);
        }else{
            System.out.println("No such Bedrooms available");
            System.out.print("Starting Price: "+startingPrice);
        }

    }
}

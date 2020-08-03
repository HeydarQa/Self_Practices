package Day06;
/*
task02:
            Create a class CompanyInfo
                Declare variables:
                            companyName
                            address
                            numberOfEmployees
                            revenue
                            isTechCompany
                Print statements and describe each value:
                                Company name is Facebook
                                address is ...
                                Number of employees is 100
                                Annual revenue is 4 000 000
                                is it tech company? - true

 */
public class task02 {
    public static void main(String[] args) {

        String companyName="Facebook";
        String address = "Silicon Valley";
        byte numberOfEmployees = 100;
        int revenue = 4_000_000;
        boolean isTechCompany = true;

        System.out.println("Company name is "+companyName);
        System.out.println("Company address is "+address);
        System.out.println("Numbe of employees is "+numberOfEmployees);
        System.out.println("Annual revenue is "+revenue+" USD");
        System.out.println("Is it tech company: "+isTechCompany);



    }
}


import SignUp.SignUpC;

import java.sql.SQLOutput;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SignUpC o = new SignUpC();
        LogIn A = new LogIn("", "");
        firsPage();
        Admin B = new Admin();


        Scanner input = new Scanner(System.in);
        System.out.println("Admin or Customer");
        String AOrC = input.nextLine();
        if(AOrC.equalsIgnoreCase("Admin")){
           B.AdminLogin();

        }
        else{
            LogIn.LogInOrSignUp();
            PurchaseOrder();
        }


    }
    static void PurchaseOrder(){
        Scanner input = new Scanner(System.in);
        GolfClub details = new GolfClub();
        System.out.println("Available Golf Clubs");
        PrintGolfClubs("Reading Country Club","Glenvista Country Club");
        System.out.println("Enter Golf Club Name: ");
        String name = input.nextLine();
        System.out.println("Enter Address ");
        String Address = input.nextLine();
        System.out.println("Choose the washing option you want: ");
        System.out.println("Full car wash with interior cleaning: R450");
        System.out.println("Full car wash with no interior cleaning: R300");
        String WashOption = input.nextLine();
        details.setOption(WashOption);
        details.setGolfClubName(name);
        details.setGolfClubAddress(Address);
        System.out.println("Car Wash details");
        System.out.println("Golf Club Name: "+details.getGolfClubName());
        System.out.println("Golf club Address: "+ details.getGolfClubAddress());
        System.out.println("Wash Option: "+details.getOption());
        if(WashOption.equalsIgnoreCase("Full car wash with interior cleaning")){
            System.out.println("Price:R450");
        }
        else{
            System.out.println("Price:R300");
        }
    }
    static void SIGNUP(){
        Scanner input = new Scanner(System.in);
        User info = new User();
        System.out.println("Enter first Name: ");
        String FName = input.nextLine();
        System.out.println("Enter Last Name: ");
        String LName = input.nextLine();
        System.out.println("Enter email");
        String email = input.nextLine();
        System.out.println("Set password: ");
        String Password = input.nextLine();
        System.out.println("YOU HAVE SUCCESSFULLY SIGNED UP");
    }
    static void prices(){
        System.out.println("Full car wash with interior cleaning: R450");
        System.out.println("Full car wash with no interior cleaning: R300");
        System.out.println("Select with price");
    }
    static void firsPage(){
        System.out.println("Welcome to GolfWash");
    }
    static void PrintGolfClubs(String... GolfClubNames){
         for (String Golf : GolfClubNames)
        System.out.println("Golf Club: "+ Golf);
    }
//    public static void AdminOrCustomer(){
//        Admin B = new Admin();
//           Scanner input = new Scanner(System.in);
//        System.out.println("Admin or Customer");
//        String AOrC = input.nextLine();
//        if(AOrC.equalsIgnoreCase("Admin")){
//            B.AdminLogin();
//        }
//        else{
//            LogIn.LogInOrSignUp();
//        }
//    }
}
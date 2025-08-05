import SignUp.*;
import java.util.Scanner;
import java.sql.SQLOutput;

public class LogIn extends SignUpC {


    public String message="forgot password?";


LogIn( String names, String password){
   super(names,password);

}
public static void LogInC(){

    //SignUpC b = new SignUpC();
    String UserName2 = "Njabulo";
    Scanner input = new Scanner(System.in);
    System.out.println("Enter User Name");
    String UserName = input.nextLine();
    System.out.println("Enter Password");
    String Password = input.nextLine();
    if(UserName2.equalsIgnoreCase(UserName)){
        String output = "Succesfull login";
        System.out.println(output);
    }
    else {
        System.out.println("Try again");
    }


//    setSignUpC(UserName);
//    setPassword2(Password);
//    System.out.println("Welcome: "+ b.getSignUpC());



}

//    @Override
//    public void SingUpS() {
//        super.SingUpS();
//    }

    public static void LogInOrSignUp(){

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Golf wash");
    System.out.println("Sign up or Login");
    String LS = input.next();
    if(LS.equalsIgnoreCase("Login")){
        LogInC();
    }
    else{
        SingUpS();
    }


}

}


import java.util.Scanner;

public class Admin {
    String AdminName;
    int AdminNumber;
    String AdminPassword;

    public void setAdminName(String AdminName){
        this.AdminName=AdminName;
    }
    public void setAdminNumber(int AdminNumber){
        this.AdminNumber=AdminNumber;
    }
   public void setAdminPassword(String AdminPassword){
        this.AdminPassword=AdminPassword;
    }
   public String getAdminName(){
        return AdminName;
    }
    int getAdminNumber(){
        return AdminNumber;
    }
    String getAdminPassword(){
        return AdminPassword;
    }
    public void AdminLogin(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Admin Name");
        String name = input.nextLine();
        System.out.println("Enter staff number");
        int number = input.nextInt();
        System.out.println("Enter Password");
        String AdminP = input.next();
        setAdminName(name);
       setAdminNumber(number);
        setAdminPassword(AdminP);
        System.out.println("Welcome: "+ getAdminName());
    }
}

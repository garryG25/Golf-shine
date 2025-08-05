import java.util.Scanner;

public abstract class Account {

  public void createAccount(){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter name");
      String NaMe = input.nextLine();
      System.out.println("Enter Last Name");
      String LastName = input.nextLine();
  }
  abstract void generateRefNumber();
}

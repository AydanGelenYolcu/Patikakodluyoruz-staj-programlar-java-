import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     String username, password, yn;
     Scanner in = new Scanner(System.in);
     System.out.println("Please enter your username:");
     username = in.nextLine();
     System.out.print("Please enter your password");
     password = in.nextLine();

     if (password.equals("is666")) {
            System.out.print("you succesfully entered");
        } else{
             System.out.print("wrong password, would you like to chaange your password, press y/n ");
             yn = in.nextLine();
             if(yn.equals("y")){
                 System.out.print("enter your new passwword ");
                 password =in.nextLine();
                 if(password.equals("is666")){
                 System.out.print("old and new password cannot be same, failed to cchange passwword ");
                 }else {
                     System.out.print("password succesfully changed");
                 }


            }else{
                 System.out.print("you are returning to main page");
             }
        }
    }

}

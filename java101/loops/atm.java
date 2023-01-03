import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        String username,passWord;
        Scanner inp=new Scanner(System.in);

        int right=3;
        double balance=1500;
        int select;

        while (right>0) {
            System.out.print("Username:");
            username = inp.nextLine();
            System.out.print("Password:");
            passWord = inp.nextLine();

            if (username.equals("patika")&& passWord.equals("java123")){
                System.out.println("You have entered to system succesfully.");
                do {
                    System.out.println("Please select a action you want to.");
                    System.out.println("1-Deposit money \n2-Withdraw money \n3-Checking balance \n4-Exit");
                    System.out.println("Your selection:");
                    select=inp.nextInt();
                    if (select==1){
                        System.out.println("Deposit amount:");
                        int deposit=inp.nextInt();
                        balance+=deposit;
                        System.out.println("New balance is:"+balance);
                    } else if (select==2) {
                        System.out.println("Withdrawal amount:");
                        int withdraw=inp.nextInt();
                        if (withdraw<=balance){
                            balance-=withdraw;
                            System.out.print("Your new balance is:"+balance);
                        }else {
                            System.out.println("Desired amount is higher than your balance. Please withdraw less amount.");
                        }
                        
                    } else if (select==3) {
                        System.out.println("Your balance is:"+balance);
                    }else {
                        System.out.println("Please enter one of the desired selecitons.");
                    }
                }while (select!=4);
                System.out.println("See you soon!");
                break;
            }else {
                right--;
                System.out.println("Wrong password or username. Please try again.");
                if (right==0){
                    System.out.println("Your account has been suspended. Please call our bank.");
                }else
                System.out.println( "Your remaining rights:"+ right);
            }
        }

    }
}

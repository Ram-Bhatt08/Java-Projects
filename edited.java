// package ATMMachine;
import java.util.Scanner;
class ATM{
    float Balance;
    int Pin = 4545;
    int enteredPin;
    public void checkpin(){
        System.out.println("Enter your pin:-");
        Scanner sc = new Scanner(System.in);
        enteredPin = sc.nextInt();
        checking();
    }
    public void checking()
    {
        if(enteredPin==Pin){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposite Money");
        System.out.println("4.EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt==1){
            checkBalance();
        }
        else if (opt==2){
            withdrawMoney();
        }
        else if (opt==3){
            depositeMoney();
        }
        else if (opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }


    }

    public void checkBalance(){
        System.out.println ("Balance:"+ Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to WIthdraw");
        Scanner sc = new Scanner (System.in);
        float amount = sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successful");
        }
        menu();

    }
    public void depositeMoney(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner ( System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();

        
    }
}
public class edited{
    public static void main (String [] args){
        ATM obj = new ATM();
        obj.checkpin();
    }
}
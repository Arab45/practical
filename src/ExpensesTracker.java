import java.util.Scanner;

public class ExpensesTracker {
    String fullName;
    double balance;
    double expenses;
    public void dailyTrackerExpenses(){
        Scanner myData = new Scanner(System.in);
        System.out.println("Enter Your Full Name");
        fullName = myData.nextLine();
        System.out.println("My name is: " + fullName);

        System.out.println("Enter Your Balance");
        balance = myData.nextDouble();
        System.out.println("Amount: " + balance);

        System.out.println("Enter Your Daily Expenses");
        expenses = myData.nextDouble();
        System.out.println("Amount: " + expenses);
    }
}

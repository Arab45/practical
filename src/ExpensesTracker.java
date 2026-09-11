import java.util.Arrays;
import java.util.Scanner;

public class ExpensesTracker {
    String fullName;
    double balance;
    double[] expenses = new double[3];
    boolean isTrue = false;
    public void dailyTrackerExpenses(){
        Scanner myData = new Scanner(System.in);
        System.out.println("Enter Your Full Name: ");
        fullName = myData.nextLine();
        System.out.println("My name is: " + fullName);

        System.out.println("Enter Your Balance: ");
        balance = myData.nextDouble();
        System.out.println("Amount: " + balance);

        for(int i = 0; i < expenses.length; i++) {
            System.out.println("Enter Your Daily Expenses: ");
            double expense = myData.nextDouble();
            Arrays.fill(expenses, expense);
            System.out.println(TrackerStatus.DEBIT + " " + expense + " " + "in" + " " + balance + " " + "balance");
            balance -= expense;
            System.out.println("Balance: " + balance);
            if(balance < 0){
                System.out.println("Insufficient account balance" + " " + balance);
            }

//            isTrue = true;
//            switch (isTrue){
//                case expenses[i] > balance:
//                    System.out.println("");
//            }
        }
    }
}

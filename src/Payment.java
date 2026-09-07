public abstract class Payment implements Balance{
    double balance = 0;
    @Override
    public double balance() {
        return balance;
    }

    @Override
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    @Override
    public double getBalance(){
       return balance();
    }


public double withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds!");
            return balance;
        }
        double withdrawBalance = amount - balance;
        return withdrawBalance;
}

private String cardNumber;

//    public creditCardPayment(double initiateBalance, ){}
}

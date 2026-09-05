public abstract class Payment implements Balance{
    double balance;
    @Override
    public double balance() {
        return balance;
    }

    @Override
    public double deposit(double amount) {
        double total = balance + amount;
        return total;
    }


}

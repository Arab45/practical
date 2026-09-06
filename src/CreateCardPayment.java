public class CreateCardPayment extends Payment{
    private String cardNumber;

    public CreateCardPayment(double initiateBalance, String cardNumber){
        this.balance = initiateBalance;
        this.cardNumber = cardNumber;
    }
}

package app;

public class App {
    public static void main(String[] args) {
        System.out.println ("This is banker program");
    }
    public static String firstname;
    private Double balance;
    public static final int CHECKING=1;
    private int accounttype;

   public App(String firstname,Double balance,int accounttype)
    {
        this.firstname=firstname;
        this.balance=balance;
        this.accounttype=accounttype;
    }
    public void deposit(Double money)
    {
        balance += money;
    }
    public void withdraw(Double money)
    {
        balance -= money;
    }
    public Double getBalance()
    {
        return balance;
    }
    public boolean isChecking()
    {
        return accounttype==CHECKING;
    }




}


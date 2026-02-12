class BankAccount {
    double accountNumber;
    String accountHolder;
    double b;
    BankAccount(double accountNumber, String accountHolder, double b){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.b = b;
    }
    void deposit(double am){
        System.out.println("Amount: " + am);
    }
    void withdraw(double am){
        System.out.println("Withdrawl Amount: " + am);
    }
    void getBalance(){
        System.out.println("Balance: " + b);
    }
    public static void main(String[] args){
        BankAccount ob = new BankAccount(20470, "Krishna", 90000);
        ob.deposit(4500);
        ob.withdraw(5000);
        ob.getBalance();
    }
}
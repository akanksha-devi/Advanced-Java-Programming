class BankAccount {
    double accountNumber;
    String accountHolder;
    double balance;
    BankAccount(double accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount){
        System.out.println("Amount: " + amount);
    }
    void withdraw(double amount){
        System.out.println("Withdrawl Amount: " + amount);
    }
    void getBalance(){
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args){
        BankAccount ob1 = new BankAccount(20470, "Krishna", 90000);
        ob1.deposit(4500);
        ob1.withdraw(5000);
        ob1.getBalance();

        BankAccount ob = new BankAccount(20470, "Krishna", 90000);
        ob.deposit(4500);
        ob.withdraw(5000);
        ob.getBalance();
    }
}

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
        BankAccount user1 = new BankAccount(20470, "Krishna", 90000);
        user1.deposit(4500);
        user1.withdraw(5000);
        user1.getBalance();

        BankAccount user2 = new BankAccount(8921, "Radhika", 100000);
        user2.deposit(95000);
        user2.withdraw(50000);
        user2.getBalance();
    }
}

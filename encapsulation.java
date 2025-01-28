class Bank {
    private int balance = 0;
    
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Total balance ater deposit: " + balance);
    }

    public void withdrawal(int amount) {
        balance -= amount;
        System.out.println("Total balance after withdrawal: " + balance);
    }
    
    public void getAccountDetails() {
        System.out.println("Total balance: " + balance);
    }
}

public class encapsulation {
    public static void main(String[] args) {
    Bank b = new Bank();
    b.getAccountDetails(); 
    b.deposit(100); 
    b.withdrawal(50); 
    b.getAccountDetails();
    }
}

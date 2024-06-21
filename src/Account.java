public class Account {
    int balance;
    String name;
    String bank;
    Account(int balance,String name,String bank) {
        this.balance = balance;
        this.name = name;
        this.bank = bank;
    }
    void deposit(int amount) {
        this.balance += amount;
    }
    void withdraw(int amount) {
        this.balance -= amount;
    }
    void interest(int amount) {
        this.balance *= interest();
    }
    void printBalance() {
        System.out.println("현재 잔고는" + this.balance);
    }
    void printName() {
        System.out.println("소요주 이름은 " + this.name);
    }
    void printBank() {
        System.out.println("은행명은 " + this.bank);
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1000,"김연비","국민은행"); //인스턴스화

        System.out.println(account.balance);
        account.deposit(1000); //매서드
        System.out.println(account.balance);
        account.withdraw(500);
        System.out.println(account.balance);

        account.printBalance();
        account.printName();
        account.printBank();

    }
}

public class BankTester {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.setAllowance(-10);
        System.out.println(bank1.getAllowance());
    }
}

public class BankTester {
  public static void main(String[] args) {
    BankAccount b1 =  new BankAccount(12,"yomama");
    b1.deposit(100);
    b1.withdraw(100);
    System.out.println(b1.getBal());
    System.out.println(b1.getaccountID());
  }
}

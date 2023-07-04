package chapter10;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer() {

    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public String getCustomerInfo() {
        return "fistName\t" + firstName +
                "\nlastName\t" + lastName +
                "\naccount.id\t" + account.getId() +
                "\naccount.balance\t" + account.getBalance() +
                "\naccount.annualInterestRate\t" + account.getAnnualInterestRate();
    }
}

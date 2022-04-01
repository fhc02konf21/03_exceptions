package org.campus02.account;

public class Account {

    private String owner;
    private double balance;
    private double overdraftFrame;

    public Account(String owner, double balance, double overdraftFrame) {
        this.owner = owner;
        this.balance = balance;
        this.overdraftFrame = overdraftFrame;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getOverdraftFrame() {
        return overdraftFrame;
    }

    public void setOverdraftFrame(double overdraftFrame) {
        this.overdraftFrame = overdraftFrame;
    }

    /**
     * aufbuchen eines Betrages
     *
     * @param amount zu aufbuchender Betrag
     */
    public void credit(double amount) {
        this.balance += amount;
    }

    /**
     * abbuchen eines bestimmten Betrages.
     * Der Überziehungsrahmen (overdraftFrame) darf nicht überschritten werden
     *
     * @param amount zu abbuchender Betrag
     * @throws NotEnoughMoneyException Exception, wenn der Überziehungsrahmen überschritten wird
     */
    public void debit(double amount) throws NotEnoughMoneyException {
        if (amount > (this.balance + this.overdraftFrame)) {
            throw new NotEnoughMoneyException("Nicht genügend Geld auf dem Konto");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", overdraftFrame=" + overdraftFrame +
                '}';
    }
}

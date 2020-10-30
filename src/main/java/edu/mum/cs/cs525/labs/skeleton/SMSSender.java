package edu.mum.cs.cs525.labs.skeleton;

public class SMSSender implements Observer {
  private Subject account;

  public SMSSender(Subject account) {
    this.account = account;
    account.registerObserver(this);
  }

  @Override
  public void inform() {
    System.out.println("SMSSender: account was updated successfully!");
  }
}

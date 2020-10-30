package edu.mum.cs.cs525.labs.skeleton;

public class EmailSender implements Observer {
  private Subject account;
  public EmailSender(Subject account) {
    this.account = account;
    account.registerObserver(this);
  }

  @Override
  public void inform() {
    System.out.println("Email sender: account was created successfully!");
  }
}

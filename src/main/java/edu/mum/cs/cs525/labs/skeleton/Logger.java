package edu.mum.cs.cs525.labs.skeleton;

import sun.rmi.runtime.Log;

public class Logger implements Observer {
  private Subject account;
  public Logger(Subject account) {
    this.account = account;
    account.registerObserver(this);
  }

  @Override
  public void inform() {
    System.out.println("Logger: account was updated successfully!");
  }
}

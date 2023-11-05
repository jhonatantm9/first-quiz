package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private int money;

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    money += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    switch (name) {
      case "ScottCola":
        if (money >= 75) {
          money -= 75;
          return new ScottCola();
        } else {
          throw new NotEnoughMoneyException();
        }

      case "KarenTea":
        if (money >= 100) {
          money -= 100;
          return new KarenTea();
        } else {
          throw new NotEnoughMoneyException();
        }

      default:
        throw new UnknownDrinkException();
    }
  }
}

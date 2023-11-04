package org.velezreyes.quiz.question6;

// public interface Drink {
//   public String getName();

//   public boolean isFizzy();
// }

public class Drink {
  private String name;
  private boolean isFizzy;

  public Drink(String name, boolean isFizzy) {
      this.name = name;
      this.isFizzy = isFizzy;
  }

  public String getName() {
      return name;
  }

  public boolean isFizzy() {
      return isFizzy;
  }
}

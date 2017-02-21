package src.chapter1;

public class CircularGC {
  public static void main(String[] args) {
    Foo1 foo = new Foo1();
    foo = null;
    System.gc();
    try {
      Thread.sleep(4000);
    } catch(InterruptedException ie) {
      System.out.println(ie);
    }
  }
}

class Foo1 {
  private static Foo1 foo;

  protected void finalize() {
    System.out.println("Finalize Method!");
    foo = this;
  }
}

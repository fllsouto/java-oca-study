package src.chapter1;

public class InstanceInitializer {
  { System.out.println("começo"); }
  private String name = "Fluffy";

  { System.out.println("setting field"); }

  { System.out.println("meio antes do init"); }
  public InstanceInitializer() {
    name = "Tiny";
    System.out.println("setting constructor");
  }

  { System.out.println("meio antes do main"); }
  public static void main(String[] args) {
    InstanceInitializer chick = new InstanceInitializer();
    System.out.println(chick.name);
  }
  { System.out.println("Fim"); }
}

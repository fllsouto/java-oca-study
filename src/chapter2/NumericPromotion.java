class Box {
  private int val;
  public Box(int val) {
    this.val = val;
  }

  public int getValue() {
    return this.val;
  }
}

public class NumericPromotion {
  public static void main(String[] args) {
    byte b1 = 1;
    byte b2 = 2;
    int b3 = b1 + b2;
    byte b4 = ++b1;

    int b5 = 10;
    long b6 = 11;
    long b7 = b5 + b6;

    int b8 = 42;
    float b9 = 10;
    float b10 = b8 + b9;

    short a1 = 10;
    short a2 = 11;
    // NumericPromotion.java:18: error: incompatible types: possible lossy conversion from int to short
    // a1 = a1 + a2;

    // Automatic casting
    a1 += a2;

    System.out.println("Value b3 : " + b3);
    System.out.println("Value b4 : " + b4);
    System.out.println("Value b7: " + b7);
    System.out.println("Value b10: " + b10);
    System.out.println("Value a1: " + a1);

    Box x = new Box(17);

    // Operador Short-circuit
    if(x == null || x.getValue() > 14) {
      System.out.println("Entrei");
    } else {
      System.out.println("Não entrei");
    }

    int foo = 8;
    boolean bar = (foo > 6) || (++foo > 8);
    System.out.println("Foo: " + foo);
    System.out.println("Bar: " + bar);

  }
}

/*
Numeric Promotion Rules

# Promoção para o maior tipo

Quando operamos dois tipos diferentes o resultado será convertido para o tipo com maior precisão:

NumericPromotion.java:10: error: incompatible types: possible lossy conversion from long to int
  int b5 = 10;
  long b6 = 11;
  int b7 = b5 + b6;

Isso evita que exista perda de precisão

# Promoção para ponto flutuante

Quando operamos um número inteiro com um ponto flutuante o resultado será convertido diretamente para ponto flutuante, para que não ocorra perda de precisão.

# Promoção de tipos pequenos

Pode haver uma perda de precisão após a operação binária em tipos pequenos (byte, short e char):
NumericPromotion.java:5: error: incompatible types: possible lossy conversion from int to byte

Então o Java determina que o resultado seja convertido para um tipo inteiro:
  byte b1 = 1;
  byte b2 = 2;
  byte b3 = b1 + b2;

Isso não acontece em operações unárias
byte b4 = b1++;


*/

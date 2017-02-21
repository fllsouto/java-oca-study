package src.chapter1;

public class StringArgs {
  public static void main(String[] args) {
    System.out.println("Args size: " + args.length);
    if( args.length > 0 ) {
      for(String arg: args) {
        System.out.println(arg);
      }
    }
  }
}

/*
* Multiplos parâmetros separados por espaço, a entrada é sempre uma String
*
* $ java src.chapter1.StringArgs waka foo bar
* > Args size: 3
* > waka
* > foo
* > bar
*
* Uma String com várias palavras
* $ java src.chapter1.StringArgs "waka foo bar"
* > Args size: 1
* > waka foo bar
*
* $ java src.chapter1.StringArgs "waka foo bar" "foo waka foo"
* > Args size: 2
* > waka foo bar
* > foo waka foo
*/

package src.chapter1;


/*
* Colisão direta de nomes
*
* import java.util.Date;
* import java.sql.Date;
* src/chapter1/PackageColision.java:5: error: a type with the same simple name is already defined by the single-type-import of Date
* import java.sql.Date;
* ^
* 1 error
*/

/*
* Sobrescrita do wildcard por que ser menos preciso que o outro (Funciona!)
*
* import java.util.Date;
* import java.sql.*;
*/

/*
* Ambiguidade no wildcard
*
* import java.util.*;
* import java.sql.*;
* src/chapter1/PackageColision.java:22: error: reference to Date is ambiguous
*   Date date;
*   ^
*   both class java.sql.Date in java.sql and class java.util.Date in java.util match
* 1 error
*/

import java.util.Date;

class DateColision {

  /* Para utilizando os dois Dates, um deles precisa ser extritamente explícito
  * Date date;
  * java.sql.Date sqlDate;
  */

  // Ou os dois
  java.util.Date date;
  java.sql.Date sqlDate;
}

public class PackageColision {
  public static void main(String[] args) {
    DateColision dc = new DateColision();
    System.out.println(dc);
  }
}

package src.chapter1.packageB;

/*
* Erro ao declarar um classe dentro de um package e ela não ser pública. Essa classe não pode ser usada no packageA
*
* class PackageB {
* //...
* }
*
* error: PackageB is not public in src.chapter1.packageB; cannot be accessed from outside package
* import src.chapter1.packageB.PackageB;
*/

// Solução
public class PackageB {
  public void showPackageB() {
    System.out.println("Eu sou o package B");
  }
}

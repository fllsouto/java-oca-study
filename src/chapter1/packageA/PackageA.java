package src.chapter1.packageA;

import src.chapter1.packageB.PackageB;

public class PackageA {
  public static void main(String[] args) {
    PackageB packageB = new PackageB();
    PackageC packageC = new PackageC();

    packageB.showPackageB();
    packageC.showPackageC();
  }
}

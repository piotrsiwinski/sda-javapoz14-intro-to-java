package pl.sda.poznan.exception;

import java.util.Scanner;

public class ArithmeticExceptionExample {
  public static void main(String[] args) {
    Scanner czytnik = new Scanner(System.in);
    System.out.println("Podaj pierwsza liczbe");
    int a = czytnik.nextInt();
    System.out.println("Podaj druga liczbe");
    int b = czytnik.nextInt();
    int wynik = 0;
    wynik = a / b;
//    try {
//      System.out.println("Udalo sie obliczyc");
//      System.out.println(wynik);
//    } catch (ArithmeticException ex) {
//      System.out.println("Nie dziel przez 0!");
//    }
//    System.out.println("KONIEC PROGRAMU");
  }
}

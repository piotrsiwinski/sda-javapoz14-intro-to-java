package pl.sda.poznan.firma;

import java.util.Scanner;

public class Application {
  private static Scanner odczyt = new Scanner(System.in);

  public static void main(String[] args) {
    boolean czyWyjsc = false;
    while (!czyWyjsc) {
      printMenu();
      System.out.println("Wybór: ");
      int wybor = odczyt.nextInt();
      switch (wybor) {
        case 1:
          {
            System.out.println("Implementacja w przygotowaniu");
            break;
          }
        case 0:
          {
            czyWyjsc = true;
            break;
          }
      }
    }
  }

  private static void printMenu() {
    System.out.println("1. Wyswietl pracownikow");
    System.out.println("2. Dodaj nowego pracownika");
    System.out.println("3. Usun pracownika");
    System.out.println("4. Wczytaj z pliku");
    System.out.println("5. Zapisz do pliku");
    System.out.println("0. Wyjście");
  }
}

package pl.sda.poznan.firma;

import pl.sda.poznan.writer.PracownikWriter;
import pl.sda.poznan.writer.WriterFactory;

import java.util.Scanner;

public class Application {
  private static Scanner odczyt = new Scanner(System.in);

  public static void main(String[] args) {
    Firma firma = new Firma("sda");
    System.out.println("Witaj w firmie!");
    boolean czyWyjsc = false;
    while (!czyWyjsc) {
      printMenu();
      System.out.println("Wybór: ");
      int wybor = odczyt.nextInt();
      switch (wybor) {
        case 1:
          wyswietlPracownikow(firma);
          break;
        case 2:
          wstawPracownika(firma);
          break;
        case 5:
          {
            System.out.println("Podaj nazwe pliku");
            String fileName = odczyt.next();
            System.out.println("Zapisuje do pliku " + fileName + "...");

            PracownikWriter writer = WriterFactory.createWriter(fileName);
            if (writer != null) {
              writer.write(firma.getPracownicy());
            } else {
              System.out.println("Nie obslugiwane rozszerzenie - obslugiwane to .txt i .xml");
            }
            break;
          }
        case 0:
          czyWyjsc = true;
          break;
      }
    }
  }

  private static void wyswietlPracownikow(Firma firma) {
    Pracownik[] pracownicy = firma.getPracownicy();
    for (Pracownik prac : pracownicy) {
      System.out.println(prac.toString());
    }
  }

  private static void wstawPracownika(Firma firma) {
    // pobierz dane o nowym pracowniku
    System.out.println("Podaj imie");
    String imie = odczyt.next();
    System.out.println("Podaj nazwisko");
    String nazwisko = odczyt.next();
    System.out.println("Podaj pensje");
    double pensja = odczyt.nextDouble();
    // wywołaj metodę dodajPracownika() na obiekcie typu Firma
    Pracownik prac = new Pracownik(imie, nazwisko, pensja);
    boolean wynik = firma.dodajPracownika(prac);

    String message = wynik ? "Nowy pracownik został dodany" : "Nie udało się dodać pracownika";

    System.out.println(message);
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

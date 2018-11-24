package pl.sda.poznan.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileExample {
  public static void main(String[] args) {
    Scanner odczyt = new Scanner(System.in);
    System.out.println("Podaj tekst i zapisze go do pliku");
    String text = odczyt.nextLine();

    System.out.println("Podaj sciezke do zapisu:");
    String path = odczyt.next();

    // zapis do pliku
    // try with resources - since java 7
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
      writer.write(text);
    } catch (IOException e) {
      System.out.println("Nie udalo sie zapisac do pliku");
    }
  }
}

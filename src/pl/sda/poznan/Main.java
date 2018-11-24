package pl.sda.poznan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
  private static final String PATH_TO_FILE =
      "/home/siwipi/IdeaProjects/sda/sda-javapoz-14-introduction-to-java/mojplik.txt";

  private static final int wiek = 0;

  public static void main(String[] args) {
    try {
      BufferedReader czytnik = new BufferedReader(new FileReader(PATH_TO_FILE));
    } catch (FileNotFoundException ex) {
      System.out.println("Nie udalo sie odczytac z pliku");
    }
  }
}

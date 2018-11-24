package pl.sda.poznan.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {
  private static final String PATH_TO_FILE =
      "/home/siwipi/IdeaProjects/sda/sda-javapoz-14-introduction-to-java/mojplik.txt";

  private static final int wiek = 0;

  public static void main(String[] args) {

    try {
      BufferedReader czytnik = new BufferedReader(new FileReader(PATH_TO_FILE));
      String line;

      while ((line = czytnik.readLine()) != null) {
        System.out.println(line);
      }
      // alternatywnie z nieskonczona petla for
      //      for(;;){
      //        line = czytnik.readLine();
      //        if(line == null){
      //          break;
      //        }
      //        System.out.println(line);
      //      }

    } catch (FileNotFoundException e) {
      System.out.println("Nie znaleziono pliku!!!");
    } catch (IOException e) {
      System.out.println("Nastapil blad odczytu");
    }
  }
}

package pl.sda.poznan.writer;

import pl.sda.poznan.firma.Pracownik;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TxtPracownikWriter implements PracownikWriter {
  private String path;

  public TxtPracownikWriter(String path) {
    this.path = path;
  }

  @Override
  public void write(Pracownik[] pracownicy) {
    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
      for (Pracownik p : pracownicy) {
        writer.write(p.toString());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

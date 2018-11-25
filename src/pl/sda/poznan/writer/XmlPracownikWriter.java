package pl.sda.poznan.writer;

import pl.sda.poznan.firma.Pracownik;

public class XmlPracownikWriter implements PracownikWriter {

  private String path;

  public XmlPracownikWriter(String path) {
    this.path = path;
  }

  @Override
  public void write(Pracownik[] pracownicy) {
    // todo: implement this
    System.out.println("TEST - TUTAJ ZAPIS DO XML");
  }
}

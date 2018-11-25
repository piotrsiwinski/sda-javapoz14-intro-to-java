package pl.sda.poznan.writer;

public class WriterFactory {

  public static PracownikWriter createWriter(String path) {
    if (path.endsWith(".txt")) {
      return new TxtPracownikWriter(path);
    } else if (path.endsWith(".xml")) {
      return new XmlPracownikWriter(path);
    } else {
      return null;
    }
  }
}

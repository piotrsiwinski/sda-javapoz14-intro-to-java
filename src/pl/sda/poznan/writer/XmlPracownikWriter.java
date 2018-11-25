package pl.sda.poznan.writer;

import pl.sda.poznan.firma.Pracownik;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;

public class XmlPracownikWriter implements PracownikWriter {

  private String path;

  public XmlPracownikWriter(String path) {
    this.path = path;
  }

  @Override
  public void write(Pracownik[] pracownicy) {
    try {
      JAXBContext context = JAXBContext.newInstance(PracownikCollection.class);
      Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      marshaller.marshal(new PracownikCollection(pracownicy), new File(path));
    } catch (JAXBException e) {
      e.printStackTrace();
    }
  }

  @XmlRootElement(name = "pracownicy")
  private static class PracownikCollection {
    @XmlElement private Pracownik[] pracownicy;

    private PracownikCollection() {}

    PracownikCollection(Pracownik[] pracownicy) {
      this.pracownicy = pracownicy;
    }
  }
}

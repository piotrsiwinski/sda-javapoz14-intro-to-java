package pl.sda.poznan.firma;

import com.sun.xml.internal.txw2.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAttribute;

public class Pracownik {

  private int id;
  private String imie;
  private String nazwisko;
  private double pensja;
  private String email;

  private Pracownik() {}

  public Pracownik(String imie, String nazwisko, double pensja) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.pensja = pensja;
  }

  public Pracownik(String imie, String nazwisko, double pensja, String email) {
    this(imie, nazwisko, pensja);
    this.email = email;
  }

  @XmlAttribute
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public double getPensja() {
    return pensja;
  }

  public void setPensja(double pensja) {
    this.pensja = pensja;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return String.format("%d, %s, %s, %.2f, %s\n", id, imie, nazwisko, pensja, email);
  }
}

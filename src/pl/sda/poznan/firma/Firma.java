package pl.sda.poznan.firma;

import java.util.Arrays;

public class Firma {
  private static final int MAX_EMPLOYEES_COUNT = 20;
  private String name;
  private Pracownik[] pracownicy;
  private int liczbaPracownikow;

  public Firma(String name) {
    this.name = name;
    this.pracownicy = new Pracownik[MAX_EMPLOYEES_COUNT];
    liczbaPracownikow = 0;
  }

  public Pracownik[] getPracownicy() {
    return Arrays.copyOf(pracownicy, liczbaPracownikow);
  }

  public boolean dodajPracownika(Pracownik pracownik) {
    if (pracownik == null) {
      throw new IllegalArgumentException("Pracownik nie moze byc nullem");
    }
    if (liczbaPracownikow == MAX_EMPLOYEES_COUNT) {
      return false;
    }
    pracownicy[liczbaPracownikow++] = pracownik;
    return true;

    ///////////////////////////////////////////////////
    //    if (liczbaPracownikow < MAX_EMPLOYEES_COUNT) {
    //      pracownicy[liczbaPracownikow++] = pracownik;
    //      return true;
    //    }
    //    return false;
  }

  public boolean usunPracownika(Pracownik pracownik) {
    // todo: implement this
    return false;
  }

  public boolean usunPracownika(int id) {
    return false;
  }
}

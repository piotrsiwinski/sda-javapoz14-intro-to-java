package pl.sda.poznan.firma;

public class Firma {
  private static final int MAX_EMPLOYEES_COUNT = 20;
  private String name;
  private Pracownik[] pracownicy;

  public Firma(String name) {
    this.name = name;
    this.pracownicy = new Pracownik[MAX_EMPLOYEES_COUNT];
  }

  public boolean dodajPracownika(Pracownik pracownik) {
    // todo: implement this
    return false;
  }

  public boolean usunPracownika(Pracownik pracownik) {
    // todo: implement this
    return false;
  }

  public boolean usunPracownika(int id){
    return false;
  }
}

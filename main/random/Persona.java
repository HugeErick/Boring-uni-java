package main.random;

public class Persona {
  private String nombre;
  private boolean trabajo;
  private boolean mujer;
  private boolean doctor;
  private boolean soltero;

  public Persona(String nombre, boolean trabajo, boolean mujer, boolean doctor, boolean soltero) {
    this.nombre = nombre;
    this.trabajo = trabajo;
    this.mujer = mujer;
    this.doctor = doctor;
    this.soltero = soltero;
  }

  public String getNombre() {
    return nombre;
  }

  public boolean isTrabajo() {
    return trabajo;
  }

  public boolean isMujer() {
    return mujer;
  }

  public boolean isDoctor() {
    return doctor;
  }

  public boolean isSoltero() {
    return soltero;
  }
  
}

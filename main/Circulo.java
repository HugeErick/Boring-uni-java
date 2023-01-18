package main;

public class Circulo {
    private int radio;
    private int id;

    public Circulo(int id) {
        this.id = id;
        this.radio = id;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public int getRadio() {
        return radio;
    }
}


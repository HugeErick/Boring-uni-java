package main;

public class Circulo {
    private int radio;
    private int id;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
        this(178145);
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


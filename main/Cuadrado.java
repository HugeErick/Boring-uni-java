package main;

public class Cuadrado {
    private double lado;
    private double diagonal;
    private double perimetro;
    private double area;
    private int id;

    public Cuadrado(double lado, int id) {
        if(lado == 0) {
          this.lado = id;
        }
        this.lado = lado;
        this.id = id;
        this.diagonal = Math.sqrt(2 * (lado * lado));
        this.perimetro = 4 * lado;
        this.area = lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public int getId() {
        return id;
    }
}

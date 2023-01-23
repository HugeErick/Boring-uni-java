package main;

public class Cuadrado {
    private double lado;
    private double diagonal;
    private double perimetro;
    private double area;
    private int id;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
        
       this(178145); 
    }

    public double getLado() {
        return lado;
    }

    public double getDiagonal() {
        this.diagonal = Math.sqrt(2 * (lado * lado));
        return diagonal;
    }

    public double getPerimetro() {
        this.perimetro = 4 * lado;
        return perimetro;
    }

    public double getArea() {
        this.area = lado * lado;
        return area;
    }

    public int getId() {
        return id;
    }
}

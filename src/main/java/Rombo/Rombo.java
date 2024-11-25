/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rombo;

/**
 *
 * @author Lorenzo
 */
public class Rombo {
    // Coordinate dei quattro vertici del Rombo
    private double x1, y1, x2, y2, x3, y3, x4, y4;
    // Costruttore per inizializzare le coordinate
    public Rombo(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;
        this.x4 = x4; this.y4 = y4;
    }
    // Metodo per calcolare l'area
    public double calcolaArea() {
        double diagonale1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double diagonale2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        return (diagonale1 * diagonale2) / 2;
    }
    // Metodo per calcolare il perimetro
    public double calcolaPerimetro() {
        double lato = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return 4 * lato;
    }
}

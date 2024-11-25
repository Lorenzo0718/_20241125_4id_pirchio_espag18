/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto;

/**
 *
 * @author Lorenzo
 */
public class Punto {
    // Coordinate x e y del punto
    private double x;
    private double y;
    // Costruttore per inizializzare le coordinate
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Metodo per calcolare la distanza dall'origine (0, 0)
    public double distanzaDallOrigine() {
        return Math.sqrt(x * x + y * y);
    }
}

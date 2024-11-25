/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cerchio;

/**
 *
 * @author Lorenzo
 */
public class Cerchio {
    // Centro e raggio del cerchio
    private double xCentro;
    private double yCentro;
    private double raggio;
    // Costruttore per inizializzare il cerchio
    public Cerchio(double xCentro, double yCentro, double raggio) {
        this.xCentro = xCentro;
        this.yCentro = yCentro;
        this.raggio = raggio;
    }
    // Metodo per calcolare l'area
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }
    // Metodo per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }
}

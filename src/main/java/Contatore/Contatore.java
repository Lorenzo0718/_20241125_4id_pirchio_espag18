/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatore;

/**
 *
 * @author Lorenzo
 */
public class Contatore {
    // Variabile privata che rappresenta il valore del contatore
    private int valore;
    // Metodo per incrementare il contatore di una unità
    public void incrementa() {
        valore++;
    }
    // Metodo per decrementare il contatore di una unità
    public void decrementa() {
        valore--;
    }
    // Metodo per ottenere il valore corrente del contatore
    public int getValore() {
        return valore;
    }
}

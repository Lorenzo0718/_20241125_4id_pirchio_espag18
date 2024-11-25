/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatore_moduloN;

/**
 *
 * @author Lorenzo
 */
public class Contatore_moduloN {
    // Variabile privata per il valore corrente del Contatore
    private int valore = 0;
    // Limite massimo del contatore
    private int limite;
    // Costruttore per inizializzare il limite
    public void ContatoreModuloN(int limite) {
        this.limite = limite;
    }
    // Metodo per incrementare il valore del contatore
    public void incrementa() {
        valore = (valore + 1) % limite;
    }
    // Metodo per decrementare il valore del contatore
    public void decrementa() {
        valore = (valore - 1 + limite) % limite;
    }
    // Metodo per ottenere il valore corrente
    public int getValore() {
        return valore;
    }
}

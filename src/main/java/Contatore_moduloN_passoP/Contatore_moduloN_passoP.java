/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatore_moduloN_passoP;

/**
 *
 * @author Lorenzo
 */
public class Contatore_moduloN_passoP {
    // Attributo privato per il valore corrente del contatore
    private int valore = 0;
    // Limite massimo e passo
    private int limite;
    private int passo;
    // Costruttore per inizializzare limite e passo

    public void ContatoreModuloNP(int limite, int passo) {
        this.limite = limite;
        this.passo = passo;
    }
    // Metodo per incrementare il contatore di un passo
    public void incrementa() {
        valore = (valore + passo) % limite;
    }
    // Metodo per decrementare il contatore di un passo
    public void decrementa() {
        valore = (valore - passo + limite) % limite;
    }
    // Metodo per ottenere il valore corrente
    public int getValore() {
        return valore;
    }
}

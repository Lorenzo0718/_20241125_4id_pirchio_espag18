/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Lorenzo
 */
//rappresentazione completa
public class TelefonoCellulare_completa {
    //dichiarazione attributi privati
    private String marca;
    private String modello;
    private double prezzo;

     // Costruttore per inizializzare gli attributi
    public void TelefonoCellulare(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }
    // Get per ottenere la marca del telefono
    public String getMarca() {
        return marca;
    }
    // Get per ottenere il modello del telefono
    public String getModello() {
        return modello;
    }
    // Get per ottenere il prezzo del telefono
    public double getPrezzo() {
        return prezzo;
    }
    // Metodo toString per una rappresentazione testuale dell'oggetto
    @Override
    public String toString() {
        return "TelefonoCellulare [marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo + "]";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auto;

/**
 *
 * @author Lorenzo
 */
public class Auto {
    //dichiarazione Attributi privati
    private String marca;
    private String modello;
    private String targa;
    private int anno;
    // Costruttore per inizializzare gli attributi
    public Auto(String marca, String modello, String targa, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.anno = anno;
    }
    // Metodo toString per una descrizione dell'oggetto Auto
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modello=" + modello + ", targa=" + targa + ", anno=" + anno + "]";
    }
}

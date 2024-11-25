/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prodotto;

/**
 *
 * @author Lorenzo
 */
public class Prodotto {
    //Dichiarazione Attributi privati
    private String proprietario;
    private String nomeNegozio;

    // Primo costruttore
    public Prodotto(String proprietario, String nomeNegozio) {
        this.proprietario = proprietario;
        this.nomeNegozio = nomeNegozio;
    }

    // Secondo costruttore 
    public Prodotto() {
        this("Sconosciuto", "Nessun Negozio");
    }

    @Override
    public String toString() {
        return "Prodotto [proprietario=" + proprietario + ", nomeNegozio=" + nomeNegozio + "]";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studente;

/**
 *
 * @author Lorenzo
 */
public class Studente {
    //Dichiarazione Attributi privati
    private String cognome;
    private String nome;
    private String codiceFiscale;
    private int numeroMatricola;
    // Costruttore per inizializzare gli attributi
    public Studente(String cognome, String nome, String codiceFiscale, int numeroMatricola) {
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.numeroMatricola = numeroMatricola;
    }
    // Metodo toString per rappresentare lo studente
    @Override
    public String toString() {
        return "Studente [cognome=" + cognome + ", nome=" + nome + ", codiceFiscale=" + codiceFiscale 
               + ", numeroMatricola=" + numeroMatricola + "]";
    }
}

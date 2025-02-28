package de.svje.finanzen.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Ausgabe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate datum;
    private Double betrag;
    private String kategorie;
    private String beschreibung;
    private String grund; // <-- NEUES FELD

    public Ausgabe() {}

    public Ausgabe(LocalDate datum, Double betrag, String kategorie, 
    		String beschreibung, String grund) {
        this.datum = datum;
        this.betrag = betrag;
        this.kategorie = kategorie;
        this.beschreibung = beschreibung;
        this.grund = grund;
    }

    // Getter und Setter
    public Long getId() { return id; }
    public LocalDate getDatum() { return datum; }
    public void setDatum(LocalDate datum) { this.datum = datum; }
    public Double getBetrag() { return betrag; }
    public void setBetrag(Double betrag) { this.betrag = betrag; }
    public String getKategorie() { return kategorie; }
    public void setKategorie(String kategorie) { this.kategorie = kategorie; }
    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String beschreibung) { this.beschreibung = beschreibung; }
    public String getGrund() { return grund; }
    public void setGrund(String grund) { this.grund = grund; }
}
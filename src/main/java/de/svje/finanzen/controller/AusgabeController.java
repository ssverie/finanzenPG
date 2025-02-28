package de.svje.finanzen.controller;

import de.svje.finanzen.model.Ausgabe;
import de.svje.finanzen.repository.AusgabeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class AusgabeController {
    private final AusgabeRepository repository;

    public AusgabeController(AusgabeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("ausgaben", repository.findAll());
        return "index";
    }

    @PostMapping("/api/ausgaben")
    public String speichereAusgabe(@RequestParam String datum,
                                   @RequestParam Double betrag,
                                   @RequestParam String kategorie,
                                   @RequestParam String beschreibung,
                                   @RequestParam String grund
                                   ) {
        repository.save(new Ausgabe(LocalDate.parse(datum), betrag, 
        		kategorie, beschreibung, grund));
        return "redirect:/";
    }
}

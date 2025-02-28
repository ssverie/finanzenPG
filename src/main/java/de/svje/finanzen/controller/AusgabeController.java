package de.svje.finanzen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import de.svje.finanzen.model.Anrede;
import de.svje.finanzen.model.Ausgabe;
import de.svje.finanzen.repository.AnredeRepository;
import de.svje.finanzen.repository.AusgabeRepository;

import java.util.List;

@Controller
public class AusgabeController {
    private final AusgabeRepository ausgabeRepository;
    private final AnredeRepository anredeRepository; // Neu

    public AusgabeController(AusgabeRepository ausgabeRepository, AnredeRepository anredeRepository) {
        this.ausgabeRepository = ausgabeRepository;
        this.anredeRepository = anredeRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Ausgabe> ausgaben = ausgabeRepository.findAll();
        List<Anrede> anreden = anredeRepository.findAll(); // Neu

        model.addAttribute("ausgaben", ausgaben);
        model.addAttribute("anreden", anreden); // Neu
        return "index";
    }
}
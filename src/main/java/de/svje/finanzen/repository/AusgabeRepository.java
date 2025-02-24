package de.svje.finanzen.repository;

import de.svje.finanzen.model.Ausgabe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AusgabeRepository extends JpaRepository<Ausgabe, Long> {}

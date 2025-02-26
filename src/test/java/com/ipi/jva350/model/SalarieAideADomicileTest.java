package com.ipi.jva350.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.LinkedHashSet;


import static org.junit.jupiter.api.Assertions.*;


class SalarieAideADomicileTest {

    SalarieAideADomicile salarieAideADomicile =  new SalarieAideADomicile();

    @Test
        // Given an employee
    void the_working_days_are_null(){
        // When there is a null work days (only instanciation above)
        // Then it can not get days off
        assertFalse(salarieAideADomicile.aLegalementDroitADesCongesPayes());
    }

    @Test
    // Given an employee
    void the_employee_has_worked_at_least_more_than_10Days() {
        // When it has work 10 days
        salarieAideADomicile.setJoursTravaillesAnneeNMoins1(10);
        // Then it can get days offs
        assertTrue(salarieAideADomicile.aLegalementDroitADesCongesPayes());
    }

    @Test
    // Given an employee
    void the_employee_has_worked_less_than_10Days() {
        // When it has work 9 days
        salarieAideADomicile.setJoursTravaillesAnneeNMoins1(9);
        // Then it can not get days offs
        assertFalse(salarieAideADomicile.aLegalementDroitADesCongesPayes());
    }

    @Test
    // Given an employee
    void calcule_jours_de_conge_decomptes_pour_plage_null() {
        // When start date is superior to end date
        LocalDate dateDebut = LocalDate.now();
        LocalDate dateFin = LocalDate.of(2025 , 1, 1);
        // Then it should return an empty array
        assertTrue(salarieAideADomicile.calculeJoursDeCongeDecomptesPourPlage(dateDebut, dateFin).isEmpty());
    }

    @Test
    // Given an employee
    void calcule_jours_de_conge_decomptes_pour_plage_() {
        LocalDate dateDebut = LocalDate.of(2025 , 1, 2);
        LocalDate dateFin = LocalDate.of(2025 , 1, 2);
       assertEquals( 1, salarieAideADomicile.calculeJoursDeCongeDecomptesPourPlage(dateDebut, dateFin).size());
    }






}

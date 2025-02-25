package com.ipi.jva350.model;

import io.cucumber.java.en.Given;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SalarieAideADomicileTest {

    SalarieAideADomicile salarieAideADomicile =  new SalarieAideADomicile();

    @Test
    // Given an employee
    public void the_employee_has_worked_more_than_10Days() {
        // When it has work 15 days
        salarieAideADomicile.setJoursTravaillesAnneeNMoins1(15);
        // Then it can get days offs
        assertTrue(salarieAideADomicile.aLegalementDroitADesCongesPayes());
    }

    @Test
    // Given an employee
    public void the_employee_has_worked_less_than_10Days() {
        // When it has work 9 days
        salarieAideADomicile.setJoursTravaillesAnneeNMoins1(9);
        // Then it can not get days offs
        assertFalse(salarieAideADomicile.aLegalementDroitADesCongesPayes());
    }

    @Test
    // Given
    public void the_working_days_are_null(){
        // When there is a null work days
        salarieAideADomicile.setJoursTravaillesAnneeNMoins1(0);
        // Then it can not get days off
        assertFalse(salarieAideADomicile.aLegalementDroitADesCongesPayes());
    }

}

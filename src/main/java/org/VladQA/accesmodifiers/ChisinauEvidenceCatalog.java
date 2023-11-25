package org.VladQA.accesmodifiers;

import org.VladQA.accesmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person vladPerson = new Person("Vlad", "Criciun",3213243124L);
        vladPerson.isRetired = false;

        if(vladPerson.isRetired) {
            System.out.println("Vlad este la pensie");
        } else {
            System.out.println("Vlad nu este la pensie");
        }

        Person sabrinaPerson = new Person("Barbacaru", "Sabrina", 321543132L, "Nationala 22/2", false);
        if(sabrinaPerson.isRetired) {
            System.out.println("Sabrina este la pensie");
        } else {
            System.out.println("Sabrina nu este la pensie");
        }

        Person tamaraPerson = new Person("Barbacaru", "Tamara", 43543561L, "Nationala 22/2",true);
        if(tamaraPerson.isRetired) {
            System.out.println("Tamara este la pensie");
        } else {
            System.out.println("Tamara nu este la pensie");
        }

        Person vasilePerson = new Person("Barbcarau", "Vasile", 43254324L, "Nationala 22/1", true);
        if(vasilePerson.isRetired) {
            System.out.println("Vasile este la pensie");
        } else {
            System.out.println("Vasile nu este la pensie");
        }

        Person alionaPerson = new Person("Criciun", "Aliona", 4325431231L);
        alionaPerson.isRetired = true;

        if(alionaPerson.isRetired) {
            System.out.println("Alione este la pensie");
        } else {
            System.out.println("Aliona nu este la pensie");
        }
    }
}

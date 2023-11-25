package org.VladQA.accesmodifiers.peopleevidence;

public class Person {
    // Proprietatile private pot fi apelate si folosite doar in interiorul clasei
    // daca vom avea Person ionPerson , atunci ionPerson.name nu va putea fi accesat.

    private String name;
    private String surname;

    // O proprietate FINAL reprezinta o constanta, asta inseamna ca aceasta nu se va schimba in timp,
    // prin urmare trebuie ca fiecare obiect initializat sa aiba un ID, acesta fiind inclus in constructor.
    private long ID;

    protected String residence;


    // Informatia despre pensie nu este atat de importanta, daca consideram ca avem un obiect Person numit ionPerson
    // atunci ionPerson.isRetired ar fi o expresie acceptata in orice clasa a proiectului. Asta deoarece public ofera acces din orice punct al proiectului.

    public boolean isRetired;


    //Constructorul de mai jos va permite crearea obiectelor Person care dispun de name, surname si id.Celelalte proprietati vor fi nule initial
    // astfel ar trebui sa folosim numeObiect.numeProprietate = valoare , pentru a le popula ulterior.

    public Person (String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        ID = id;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 3 parametri formali ");
    }

        // Constructorul de mai jos accepta o serie de variabile locale si le foloseste pentru a popula toate proprietatile unui obiect nou.
        //
        public Person(String name, String surname, long id, String residence, boolean isRetired){
            this.name = name;
            this.surname = surname;
            this.ID = id;
            this.residence = residence;
            this.isRetired = isRetired;
            System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 5 parametri formali");
        }

    }

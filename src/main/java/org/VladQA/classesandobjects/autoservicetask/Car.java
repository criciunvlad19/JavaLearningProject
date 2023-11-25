package org.VladQA.classesandobjects.autoservicetask;

public class Car {
    public String plateNumber;
    public int knWhenEnteredTheService;
    public String color;
    public String make;
    public String model;

    // Constructorul de mai jos primeste 3 parametri de intrare, in rezultat va crea un obiect Car despre care v-om cunoaste
    // marca, modelul, culoarea dar nu si alte detalii precum plate number sau km.

    public Car(String makeParametruDeIntrare, String modelFormalParameter, String colorLocalVariable) {
        this.make = makeParametruDeIntrare;
        this.model = modelFormalParameter;
        this.color = colorLocalVariable;
    }

    // Acest constructor va crea un obiect de tipul Car despre care se va cunoaste doar numarul de inmatriculare.

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}

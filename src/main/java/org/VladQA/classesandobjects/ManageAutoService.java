package org.VladQA.classesandobjects;

import org.VladQA.classesandobjects.autoservicetask.Car;
import org.VladQA.classesandobjects.autoservicetask.Garage;
import org.VladQA.classesandobjects.autoservicetask.Tool;
import org.VladQA.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {
    public static void main(String[] args) {
        Car mercedesBenzSeriaE = new Car("E Class", "Mercedes", "Verde");

        mercedesBenzSeriaE.plateNumber = "PRA 985";
        mercedesBenzSeriaE.knWhenEnteredTheService = 154478;

        System.out.println("Masina " + mercedesBenzSeriaE.make + " de model " + mercedesBenzSeriaE.model +
                " de culoare " + mercedesBenzSeriaE.color + " are numarul de inmatriculare " + mercedesBenzSeriaE.plateNumber +
                " si kilometrajul " + mercedesBenzSeriaE.knWhenEnteredTheService);

        Car vwPolo = new Car("HTE 455");
        Car volvoXC90 = new Car("BOS 356");

        Tool ciocan = new Tool("Ciocan");
        ciocan.weight = 1.65;
        ciocan.price = 99.90D;
        System.out.println("Unealta cu denumirea " + ciocan.name + " are pretul " + ciocan.price + " si greutatea " + ciocan.weight);

        Tool surubelnita = new Tool();
        surubelnita.name = "Surubelnita";
        surubelnita.weight = 1;
        surubelnita.price = 50.00D;
        System.out.println("Unealta cu denumirea " + surubelnita.name + " are pretul " + surubelnita.price + " si greutatea " + surubelnita.weight);

        Worker ionMuncitor = new Worker();
        ionMuncitor.name = "Ion";
        ionMuncitor.age = 45;
        ionMuncitor.weight = 79.50D;
        ionMuncitor.height = 1.80D;
        System.out.println("Muncitorul " + ionMuncitor.name + " are " + ionMuncitor.age + " de ani, si inaltimea de " + ionMuncitor.height +
                " la " + ionMuncitor.weight + " de kilograme");

        Garage garageBavaria = new Garage();
        garageBavaria.address = "Soseaua Voinesti 50";
        garageBavaria.name = "Garaj Bavaria";
        System.out.println("Garajul " + garageBavaria.name + " este situat la adresa " + garageBavaria.address);

    }
}

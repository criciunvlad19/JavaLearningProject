package org.VladQA.classesandobjects.autoservicetask;

public class Tool {
    public double price;
    public String name;
    public double weight;

    public Tool(String name) {
        this.name = name;
        System.out.println("Un obiect de tip tool a fost creat, numele lui este " + this.name);
    }

    public Tool() {
        System.out.println("O noua unealta a fost creata in cadrul programului.Nu dispunem despre detaliile ei"
                + " pentru detalii Numele este " + this.name + " iar greutatea este " + this.weight);

    }
}

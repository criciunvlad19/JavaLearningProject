package org.VladQA.zooclubservice;

public class Cat extends Animal implements AnimalInterface{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + getName() + " says: Meow!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating KitKat.");
    }
}

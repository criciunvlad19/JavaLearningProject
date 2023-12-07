package org.VladQA.zooclubservice;

public class ZooService{
    public static void main(String[] args) {
        Animal Dog = new Dog("rex");
        Animal Cat = new Cat("masha");
        Cat secondCat = new Cat("pisi");
        Dog secondDog = new Dog("lucian");

        Dog.eat();

        secondCat.eat();
        Cat.eat();

        secondCat.makeSound();
        secondDog.makeSound();
        Dog.makeSound();
        Cat.makeSound();
    }


}

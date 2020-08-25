package com.endava.trening;

public class Cat extends Animal implements Talker{// x2 alt + enter dodaje konstruktor i metodu

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miau");

    }

    @Override
    public void makeSound(String sound) {
        System.out.println("Miau " + sound);
    }

    @Override
    public String toString() {
        return "Cat " +getName(); /// 6. upotreba toString
    }
}

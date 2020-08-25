package com.endava.trening;

import java.util.Objects;

public abstract class Animal {//ne moze klasa biti koriscena samostalno vec mora biti extendovana

    //Animals has-a string
    private String name;

    public Animal(String name) {//desni klik -> Generate -> Constructor
        this.name = name;// sa this diferenciramo
    }//ako roditelj ima konstruktor onda naslednik mora imati konstruktor koji se poklapa

    //desni klik -> Generate -> Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //i macka i pas ce naslediti ovu metodu

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//ako je isto mesto u memoriji
        if (o == null || getClass() != o.getClass()) return false;// da li su jednaki
        Animal animal = (Animal) o;// konvertuje sve u Animal i uporedjuje ih
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

package com.endava.trening;

import java.util.ArrayList;
import java.util.List;

// Dog is-a Animal, Talker, Eater and Object mozemo proveriti sa instanceof
public class Dog extends  Animal implements Talker, Eater{//dodali smo ove interfejse i moramo implementirati njihove metode

    /*
    1. variables u klasi su private
    private String name; //state smo premestili u roditeljsku klasu ako i ovde ostavimo onda ce biti override
    1. konstruktor dioltni koji pravi kompajler
        public Dog () {
            super();
            name = null;
        }
    2. konstruktor koji smo napravili da korisnik doda vrednosti
    */

    //
    // Dog has-a list of string
    private List<String> foodMenu = new ArrayList<>();// dobra enkapsulacija treba da bude nedodirljiva spolja i dodajemo private

    public Dog (String nameToSet) {
        super(nameToSet);
    }

    @Override // Alt + Enter na naziv cele klase i sam ce mi ubaciti ovu metodu
    public void makeSound() {
        System.out.println("Av av");

    }

    @Override
    public void makeSound(String sound) {
        System.out.println("Av av " +  sound);
    }

    @Override
    public void addFood(String food) {// 6.dodaje hranu na meni
        foodMenu.add(food);
    }

    @Override
    public void foodEating() {// stampa dodatu hranu
        System.out.println(foodMenu);

        //System.out.println("Koske");
    }

    //3. geter mora biti pablic
//    public String getName(){
//        return name;
//
//    }
//
//    //seter je void nevraca nista
//    public void setName(String nameToSet){
//        name = nameToSet;//podesavamo na vrednost koja je prosledjena
//    }

    //4. method sam sklonila da se vidi kako ce interfejs reagovati
//    public void makeSound(){//ponasanje
//        System.out.println("Woof");
//    }

}

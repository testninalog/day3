package com.endava.trening;

public class TestClass {

    public static void main(String[] args) {
        Dog pas = new Dog("Pas");//napravili smo novu instancu
//        pas.name = "Pas"; kad smo dodali gore argument nameToSet ovaj red postaje suvisan
        //.name nece raditi jer smo sad namestili private variable
        //kako sad menjamo ime
        pas.setName("Kuca"); //set ocekuje parametar
        pas.makeSound();
        System.out.println(pas.getName());

        System.out.println(pas instanceof Dog);//polimofizam
        System.out.println(pas instanceof Animal);
        System.out.println(pas instanceof Object);

        // umesto Cat mozemo staviti Animal ili Talker, ali posto je makeSound u Talkeru samo tad ce prepoznati metodu
        Cat maca = new Cat("maca");// maca je objekat Cat je tip objekta i pokazuje u Cat konstruktor, a
        maca.makeSound();
        maca.makeSound("frrrr");//5. overloaded


        System.out.println(maca); // mozemo da stavimo maca.toString ali to ce sam uraditi kompajler

        System.out.println(maca.equals(maca));
        System.out.println(maca.equals(pas));// dve zivote su jednake ako su obe npr mace sa istim imenom

        ///moze se koristiit equals da proverim da li je neki element u listi, najcesce se koristi pri pretrazi objekata
//        Animal[] zoo = {pas, maca};// usecase of polimorfizam
        pas.foodEating();//6. odstampace prazan niz jer nema nista jos dodato

        pas.addFood("Granule");
        pas.addFood("Stek");
        pas.addFood("Koske");
        pas.foodEating();// stampa gore navedena 3
    }
}

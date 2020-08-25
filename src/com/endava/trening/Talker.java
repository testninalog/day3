package com.endava.trening;

public interface Talker {//sve metode u interfejsu su abstract

    void makeSound();// posto je abstract nema telo
    void makeSound (String sound); // 5. ovo je overloading jer ima argument vise od prethodne
    // zbog toga ce se pojaviti greske u naslednicamma jer moramo i ovu metodu da implementiramo
}

package com.dmdev.cs.lesson18;

import com.dmdev.cs.lesson15.Archer;
import com.dmdev.cs.lesson15.Hero;
import com.dmdev.cs.lesson15.Warrior;
import com.dmdev.cs.lesson18.weapon.Bow;
import com.dmdev.cs.lesson18.weapon.Sword;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());
        printWeaponDamage(warrior);
    }

//                                       Warrior<-------->
//    wildcard ограничения не только сверху(extends) но и снизу(super)
    public static void printWeaponDamage(Hero<? super Sword> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}

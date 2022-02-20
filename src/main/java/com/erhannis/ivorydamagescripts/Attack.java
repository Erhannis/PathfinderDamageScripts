/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erhannis.ivorydamagescripts;

/**
 *
 * @author erhannis
 */
public class Attack {
    public final Roll toHit;
    public final Roll toDamage;
    
    public Attack(Roll toHit, Roll toDamage) {
        this.toHit = toHit;
        this.toDamage = toDamage;
    }
    
    public int rollToHit() {
        return toHit.roll();
    }

    public int rollToDamage() {
        return toDamage.roll();
    }
}

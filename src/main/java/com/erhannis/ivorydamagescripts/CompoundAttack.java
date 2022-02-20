/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erhannis.ivorydamagescripts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erhannis
 */
public class CompoundAttack extends Attack {
    public final List<Attack> additions;
    
    public CompoundAttack(Roll toHit, Roll toDamage) {
        this(toHit, toDamage, new ArrayList<>());
    }
    
    public CompoundAttack(Roll toHit, Roll toDamage, List<Attack> additions) {
        super(toHit, toDamage);
        this.additions = new ArrayList<>(additions);
    }
    
    public CompoundAttack plus(Attack atk) {
        ArrayList<Attack> newAdditions = new ArrayList<>(this.additions);
        newAdditions.add(atk);
        return new CompoundAttack(this.toHit, this.toDamage, newAdditions);
    }

    @Override
    public int rollToHit() {
        int r = super.rollToHit();
        for (Attack atk : additions) {
            r += atk.rollToHit();
        }
        return r;
    }

    @Override
    public int rollToDamage() {
        int r = super.rollToDamage();
        for (Attack atk : additions) {
            r += atk.rollToDamage();
        }
        return r;
    }
}

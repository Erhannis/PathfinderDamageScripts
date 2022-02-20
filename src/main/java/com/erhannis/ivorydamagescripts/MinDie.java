/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erhannis.ivorydamagescripts;

import java.security.SecureRandom;

/**
 *
 * @author erhannis
 */
public class MinDie extends Die {
    public final int min;
    
    public MinDie(int sides, int min) {
        super(sides);
        this.min = min;
    }
    
    @Override
    public int roll() {
        int r = super.roll();
        if (r < min) {
            r = min;
        }
        return r;
    }
}

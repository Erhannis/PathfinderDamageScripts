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
public class Die {
    public static final SecureRandom rand = new SecureRandom();
    
    public static final Die D2 = new Die(2);
    public static final Die D4 = new Die(4);
    public static final Die D6 = new Die(6);
    public static final Die D8 = new Die(8);
    public static final Die D10 = new Die(10);
    public static final Die D12 = new Die(12);
    public static final Die D20 = new Die(20);
    public static final Die D100 = new Die(100);
    
    public final int sides;
    
    public Die(int sides) {
        this.sides = sides;
    }
    
    public int roll() {
        return rand.nextInt(sides)+1;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erhannis.ivorydamagescripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author erhannis
 */
public class Roll {
    public final List<Die> dice;
    public final int modifier;
    
    public Roll(int modifier, Die... dice) {
        this.modifier = modifier;
        this.dice = Arrays.asList(dice);
    }
    
    public int roll() {
        int total = 0;
        for (Die die : dice) {
            int r = die.roll();
            MainFrame.log("+("+r+"/"+die.sides+")");
            total += r;
        }
        if (modifier > 0) {
            MainFrame.log("+"+modifier);
        } else if (modifier < 0) {
            MainFrame.log(""+modifier);
        }
        total += modifier;
        return total;
    }
    
    public static Roll ndn(int count, Die die, int modifier) {
        Die[] dice = new Die[count];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = die;
        }
        return new Roll(modifier, dice);
    }
}

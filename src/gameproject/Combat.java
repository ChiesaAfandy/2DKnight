/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;

import java.util.Random;

/**
 *
 * @author Chiesaafandy
 */
public class Combat {
    public static Random acak = new Random();
    
    public static int pcAttack(){
        MCharacter mc = new MCharacter();
        mc.getDamage();
        
        
        int attack;
        System.out.println("Player Attack");
        
        attack = acak.nextInt(mc.getMaxDamage() + 1);
        
        if (attack == 0){
            System.out.println("Miss");
        }
        else if(attack == mc.getMaxDamage()){
            System.out.println("Critical Hit");
            attack = attack + 10;
        }
        else{
            System.out.println(attack);
        }
        
        return attack;
    }
    
    public static int pcHeal(){
        MCharacter mc = new MCharacter();
        mc.getHeal();
        
        
        int heal;
        
        heal = mc.getHeal() + 10;
        
        return heal;
        
    }
    
    
}

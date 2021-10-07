/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;

/**
 *
 * @author Chiesaafandy
 */
public class MCharacter {
    public static String name;
    public static int HP;
    public static int damage;
    public static int heal;
    public static int maxHP = 100;
    public static int maxHeal = 20;
    public static int maxDamage = 30;

    public static int getMaxHeal() {
        return maxHeal;
    }

    public static void setMaxHeal(int maxHeal) {
        MCharacter.maxHeal = maxHeal;
    }

    public static int getMaxDamage() {
        return maxDamage;
    }

    public static void setMaxDamage(int maxDamage) {
        MCharacter.maxDamage = maxDamage;
    }

    public static int getMaxHP() {
        return maxHP;
    }

    public static void setMaxHP(int maxHP) {
        MCharacter.maxHP = maxHP;
    }

    
    
    public static int getHeal() {
        return heal;
    }

    public static void setHeal(int heal) {
        MCharacter.heal = heal;
    }
    
    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MCharacter.name = name;
    }

    public static int getHP() {
        return HP;
    }

    public static void setHP(int HP) {
        MCharacter.HP = HP;
    }

    public static int getDamage() {
        return damage;
    }

    public static void setDamage(int damage) {
        MCharacter.damage = damage;
    }

    
    
}

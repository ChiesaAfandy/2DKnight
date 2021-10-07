  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;

import java.util.Random;

/**
 *
 * @author Darell
 */
public class BossEnemy {
//nama 
//hp
//attack power 
    public static Random acak = new Random();
    
    private static String bossName ;
    private static int hp;
    private static int attackPower;

    public static String getBossName() {
        return bossName;
    }

    public static void setBossName(String aBossName) {
        bossName = aBossName;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int aHp) {
        hp = aHp;
    }

    public static int getAttackPower() {
        return attackPower;
    }

    public static void setAttackPower(int aAttackPower) {
        
        attackPower = aAttackPower;
    }
    
    public static int EnemyAttack(){
        
        
        
        int attack;
        System.out.println("Enemy Attack");
        
        attack = acak.nextInt(getAttackPower() + 1);
        
        if (attack == 0){
            System.out.println("Miss");
        }
        else if(attack == getAttackPower()){
            System.out.println("Critical Hit");
            attack = attack + 10;
        }
        else{
            System.out.println(attack);
        }
        
        return attack;
    }
    
}

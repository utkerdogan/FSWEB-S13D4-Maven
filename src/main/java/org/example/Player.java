package org.example;

public class Player {
    
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public double healthRemaining(){
        return healthPercentage;
    }
    
    public void loseHealth(int damage){
        healthPercentage -= damage;
        if(healthPercentage <= 0){
            healthPercentage = 0;
            System.out.println(name + " has been knocked out of the game");
        }
    }

    public void restoreHealth(int healthPotion){
        healthPercentage += healthPotion;
        if(healthPercentage > 100){
            healthPercentage = 100;
        }
    }
    
}

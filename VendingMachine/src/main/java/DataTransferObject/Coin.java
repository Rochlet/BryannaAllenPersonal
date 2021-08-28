/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTransferObject;

/**
 *
 * @author 88bry
 */
public class Coin {
    String name;
    float worth;
    int numOfCoins;
    
    public Coin(String name, float worth, int numOfCoins){
        this.name = name;
        this.worth = worth;
        this.numOfCoins = numOfCoins;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWorth() {
        return worth;
    }

    public void setWorth(float worth) {
        this.worth = worth;
    }

    public int getNumOfCoins() {
        return numOfCoins;
    }

    public void setNumOfCoins(int numOfCoins) {
        this.numOfCoins = numOfCoins;
    }
}

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
public class Item {
    String name;
    float price;
    int numOfItem;
    
    public Item(String name, float price, int amountInStock){
        this.name = name;
        this.price = price;
        this.numOfItem = amountInStock;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public float getPrice(){
        return price;
    }
    
    public void setNumOfItem(int numOfItem){
        this.numOfItem = numOfItem;
    }
    
    public int getNumOfItem(){
        return numOfItem;
    }
}

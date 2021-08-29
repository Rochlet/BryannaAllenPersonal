/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import DataTransferObject.Coin;

/**
 *
 * @author 88bry
 */
public class Display {
    private UserIO io = new UserIOImpl();
    
    public void theMachine() {
        io.print("_____________________________");
        io.print("||_____________________|     |");
        io.print("||          ||         |     |");
        io.print("||   Soda   ||   Gum   |     |");
        io.print("||    $2    ||  $0.50  |     |");
        io.print("||__________||_________|     |");
        io.print("||          ||         | ___ |");
        io.print("|| Crackers || Cookies |     |");
        io.print("||    $1    ||  $1.50  | ||  |");
        io.print("||__________||_________| ||  |");
        io.print("||          ||         |     |");
        io.print("||  Water   ||   Toy   |     |");
        io.print("||  $0.75   ||   $5    |     |");
        io.print("||__________||_________|     |");
        io.print("||          ||         |     |");
        io.print("||  Candy   ||  Chips  |     |");
        io.print("||  $2.50   ||  $1.25  |     |");
        io.print("||__________||_________|     |");
        io.print("| _____________________      |");
        io.print("| |                   |      |");
        io.print("| |        Push       |      |");
        io.print("| |___________________|      |");
        io.print("|____________________________|");
    }
    
    public void enterMoneyBanner() {
        io.print("____________________________");
        io.print("|                          |");
        io.print("|      ENTER   MONEY       |");
        io.print("|__________________________|");
    }
    
    public void acceptMoneyBanner() {
        io.print("____________________________");
        io.print("|                          |");
        io.print("|     MONEY   ACCEPTED     |");
        io.print("|__________________________|");
    }
    
    public void pickItemBanner() {
        io.print("____________________________");
        io.print("|                          |");
        io.print("|    PICK   AN   ITEM      |");
        io.print("|__________________________|");
    }
    
    public void itemSelectedBanner() {
        io.print("____________________________");
        io.print("|                          |");
        io.print("|     ITEM   SELECTED      |");
        io.print("|__________________________|");
    }
    
    public void itemDispensingBanner() {
        io.print("____________________________");
        io.print("|                          |");
        io.print("|    ITEM   DISPENSING     |");
        io.print("|__________________________|");
    }
    
    public void enjoyBanner() {
        io.print("____________________________");
        io.print("|                          |");
        io.print("|          ENJOY           |");
        io.print("|__________________________|");
    }
}

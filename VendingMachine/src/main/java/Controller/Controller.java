/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DataAccessObject.DataAccessObject;
import DataAccessObject.DataAccessObjectImplement;
import DataTransferObject.Coin;
import Service.ServiceLayer;
import Service.ServiceLayerImpl;
import UserInterface.Display;
import UserInterface.UserIO;
import UserInterface.UserIOImpl;

/**
 *
 * @author 88bry
 */
public class Controller {
    private UserIO io = new UserIOImpl();
    private Display display = new Display();
    private ServiceLayer service = new ServiceLayerImpl();
    
    public void run(){
        boolean keepGoing = true;
        String input;
        
        do {
            display.theMachine();
            
            input = io.readString("Would you like to get something?");
            input = input.toLowerCase();
            switch (input) {
                case "yes":
                    display.enterMoneyBanner();
                    Coin coin = service.getMoney();
                    break;
                case "no":
                    keepGoing = false;
                    break;
                default:
                    io.print("Invalid input. Please try again.");
            }
        } while (keepGoing);
        
        io.print("Thanks for coming!");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import DataTransferObject.Coin;
import DataTransferObject.Item;
import java.util.List;

/**
 *
 * @author 88bry
 */
public interface DataAccessObject {
    void addCoin(String name) throws Exception;
    List<Item> getAllItems() throws Exception;
    List<Coin> getAllCoins() throws Exception;
    Item getItem(String name);
    Item removeItem(String name);
}

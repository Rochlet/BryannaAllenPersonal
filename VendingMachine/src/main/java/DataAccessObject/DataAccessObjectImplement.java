/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

import DataTransferObject.Coin;
import DataTransferObject.Item;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author 88bry
 */
public class DataAccessObjectImplement implements DataAccessObject {
    private Map<String, Item> items = new HashMap<>();
    private Map<String, Coin> coins = new HashMap<>();
    public static final String CONTENTS_FILE = "contents.txt";
    public static final String MONEY_FILE = "money.txt";
    public static final String DELIMITER = "::";

    @Override
    public void addCoin(String name) throws Exception {
        loadMoney();
        Coin currentCoin = coins.get(name);
        int prevNumOfCoin = currentCoin.getNumOfCoins();
        currentCoin.setNumOfCoins(prevNumOfCoin + 1);
        writeMoney();
    }
    
    @Override
    public void addItems() throws Exception {
        loadContents();
        List<Item> itemList = items.getAllKeys();
        for (Item currentItem : itemList) {
            currentItem.setNumOfItems(10);
        }
        writeItems();
    }
        

    @Override
    public List<Item> getAllItems() throws Exception {
        loadContents();
        return new ArrayList(items.values());
    }
    
    @Override
    public List<Coin> getAllCoins() throws Exception {
        loadMoney();
        return new ArrayList(coins.values());
    }

    @Override
    public Item getItem(String name) throws Exception {
        loadContents();
        return items.get(name);
    }
    
    @Override
    public Coin getCoin(String name) throws Exception {
        loadMoney();
        return coins.get(name);
    }

    @Override
    public void removeItem(String name) throws Exception {
        loadContents();
        Item currentItem = items.get(name);
        int prevNumOfItems = currentItem.getNumOfItems();
        currentItem.setNumOfItems(prevNumOfItems - 1)
        writeContents();
    }
    
    @Override
    void removeCoins() throws Exception {
        loadMoney();
        ArrayList<Coin> coinList = coins.getAllKeys();
        for (Coin currentCoin : coinList) {
            currentCoin.setNumOfCoins(0);
        }
        writeMoney();
    }
    
    private Item unmarshallItem(String itemAsText){
        String[] itemTokens = itemAsText.split(DELIMITER);
        String name = itemTokens[0];
        float price = parseFloat(itemTokens[1]);
        int numOfItem = parseInt(itemTokens[2]);
        Item itemFromFile = new Item(name, price, numOfItem);
        return itemFromFile;
    }
    
    private void loadContents() throws Exception {
        Scanner scanner;
        
        try {
            scanner = new Scanner( new BufferedReader(new FileReader(CONTENTS_FILE)));
        } catch (Exception e) {
            throw new Exception("later", e);
        }
        
        String currentLine;
        Item currentItem;
        
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentItem = unmarshallItem(currentLine);
            items.put(currentItem.getName(), currentItem);
        }
        scanner.close();
    }
    
    private String marshallItem(Item item) {
        String itemAsText = item.getName() + DELIMITER;
        itemAsText += item.getPrice() + DELIMITER;
        itemAsText += item.getNumOfItem();
        return itemAsText;
    }
    
    private void writeContents() throws Exception {
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter(CONTENTS_FILE));
        } catch (Exception e) {
            throw new Exception("later",e);
        }
        
        String itemAsText;
        List<Item> itemList = this.getAllItems();
        
        for (Item currentItem : itemList) {
            itemAsText = marshallItem(currentItem);
            out.println(itemAsText);
            out.flush();
        }
        out.close();
    }
    
    private Coin unmarshallCoin(String coinAsText){
        String[] coinTokens = coinAsText.split(DELIMITER);
        String name = coinTokens[0];
        float worth = parseFloat(coinTokens[1]);
        int numOfCoins = parseInt(coinTokens[2]);
        Coin coinFromFile = new Coin(name, worth, numOfCoins);
        return coinFromFile;
    }
    
    private void loadMoney() throws Exception {
        Scanner scanner;
        
        try {
            scanner = new Scanner( new BufferedReader(new FileReader(MONEY_FILE)));
        } catch (Exception e) {
            throw new Exception("later", e);
        }
        
        String currentLine;
        Coin currentCoin;
        
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentCoin = unmarshallCoin(currentLine);
            coins.put(currentCoin.getName(), currentCoin);
        }
        scanner.close();
    }
    
    private String marshallCoin(Coin coin) {
        String coinAsText = coin.getName() + DELIMITER;
        coinAsText += coin.getWorth() + DELIMITER;
        coinAsText += coin.getNumOfCoins();
        return coinAsText;
    }
    
    private void writeMoney() throws Exception {
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter(MONEY_FILE));
        } catch (Exception e) {
            throw new Exception("later",e);
        }
        
        String coinAsText;
        List<Coin> coinList = this.getAllCoins();
        
        for (Coin currentCoin : coinList) {
            coinAsText = marshallCoin(currentCoin);
            out.println(coinAsText);
            out.flush();
        }
        out.close();
    }
}

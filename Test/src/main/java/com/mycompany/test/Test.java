/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author 88bry
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = null;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse("09/07/2021", format);
        String dateFile = date.toString();
        System.out.println("Orders_" + dateFile);
        
    }
}

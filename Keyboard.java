/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author hmuhire
 */
import java.util.Scanner;

public class Keyboard {
    Scanner keyboard;

    Keyboard() {
        keyboard = new Scanner(System.in);
    }

    int nextInt() {
        String line = keyboard.nextLine();
        int n;
        try{
            n = Integer.parseInt(line.trim());
        } catch (NumberFormatException e) {
            n = Integer.MIN_VALUE;
        }
        return n;
    }

    String nextLine() {
        return keyboard.nextLine();
    }
}

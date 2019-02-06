/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hmuhire
 */
public class ReadingFile {
    public static void main(String [] args) throws FileNotFoundException{
        String filename = "C://Users//hmuhire//Desktop//file1.txt";
        File textFile = new File(filename);
        Scanner in = new Scanner(textFile);
        
        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
            
        
        
        }
        in.close();
        
        
        
        
    }
    
}

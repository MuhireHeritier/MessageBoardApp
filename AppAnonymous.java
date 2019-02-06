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
class Machine{
    public void start(){
        System.out.println("Starting the machine............");
    }
}
public class AppAnonymous {
    public static void main(String [] args){
        Machine machine1 = new Machine(){ 
       @Override
       public void start(){
            System.out.println("Start the APP more life....");
        }
        };
        machine1.start();
    }
    
}

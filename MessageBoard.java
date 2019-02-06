/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hmuhire
 */
public class MessageBoard {

    /**
     * @param args the command line arguments
     */
    private final String mBTitle;
    private List<Topic> topics;
    
    public MessageBoard(String name){
        mBTitle = name;
        topics = new ArrayList<Topic>();
        
    }
    public void addTopic(Topic t){
        topics.add(t);
    }
    
    public Topic getTopic(int n){
        return topics.get(n);
    }
    public int getNumberOfTopics(){
        return topics.size();
    }
    
    public void display(){
        System.out.println(mBTitle);
        System.out.println("----------");
        for(int i=0; i< topics.size();i++){
            System.out.println(String.format("%d: %s", i, topics.get(i).toString()));
        }
    }
    
}

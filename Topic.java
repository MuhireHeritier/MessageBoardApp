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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topic {
    private List<Message> messages;
    private String title;
    
    public Topic(String t){
        messages = new ArrayList<>();
        title=t;
    }
    
    public String displayTopic(){
        StringBuilder b = new StringBuilder();
        b.append(title);
        b.append('\n');
        b.append("----------------");
        for (int i=0;i < messages.size(); i++){
            Message m = messages.get(i);
            b.append(String.format("%d: %s\n", i, m.displayMessage()));
            
        }
        return b.toString();
    }
    
    public List<Message> getMessages(){
        return Collections.unmodifiableList(messages);
    }
    public void addMessage(Message m){
        messages.add(m);
    }
    public Message removeMessage(int index){
        if (index < 0 || index >= messages.size()){
            return null;
        }
        return messages.remove(index);
    }
    
    public String getTitle(){
        return title;
    }
    public String toString(){
        StringBuilder b = new StringBuilder();
        b.append("TOpic: ");
        b.append(title);
        for (Message m : messages){
            b.append(m.displayMessage());
        }
        return b.toString();
    }
}

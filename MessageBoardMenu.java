/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author hmuhire
 */
public class MessageBoardMenu {
    private MessageBoard currentBoard;
    
    public MessageBoardMenu(MessageBoard mb){
        currentBoard = mb;
    }

    public void displayMessageBoardMenu() {
        currentBoard.display();
        
       //String line = keyBoard.nextLine();
       //int n = Integer.parseInt(line.trim());

        int option = 0;
        Keyboard keyBoard = new Keyboard();
        do {
            System.out.println("Main Menu:");
            System.out.println("----------");
            System.out.println("1. Add new topic");
            System.out.println("2. Select a topic to view or post to");
            System.out.println("3. Quit");
            System.out.println("----------");
            System.out.println("Enter your choice:");
            option = keyBoard.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the title of your new topic:");
                    String t = keyBoard.nextLine();
                    System.out.println("topic is: " + t);
                    currentBoard.addTopic(new Topic(t));
                      currentBoard.display();
                    break;

                case 2:
                    System.out.println("Enter the number of the topic you would like to go to:");
                    int choice = keyBoard.nextInt();
                    if (choice >= 0 && choice < currentBoard.getNumberOfTopics() ) {
                        Topic topic = currentBoard.getTopic(choice);
                        System.out.println("Topic " + choice + " (" + topic.getTitle() + ") selected");
                        new TopicMenu(topic, keyBoard).displayTopicMenu();
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    System.out.println("Goodbye.");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please enter one of the options above.");
                    displayMessageBoardMenu();
            }

        } while (option != 3);
    }
}
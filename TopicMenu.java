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
public class TopicMenu {
    private Topic currentTopic;
    private Keyboard keyBoard;
    private Message currentMessage;

    TopicMenu(Topic t, Keyboard keyBoard) {
        currentTopic = t;
        this.keyBoard = keyBoard;
    }

    void displayTopicMenu() {
        currentTopic.displayTopic();

        int option = 0;

        do {
            System.out.println("Topic Menu:");
            System.out.println("============");
            System.out.println("1. Add new message");
            System.out.println("2. List messages");
            System.out.println("3. Delete message");
            System.out.println("4. Go back to main menu");
            System.out.println("============");
            System.out.println("Enter your choice:");
            option = keyBoard.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the subject of your message:");
                    String subject = (String) keyBoard.nextLine();

                    System.out.println("Enter the text of your message:");
                    String contents = (String) keyBoard.nextLine();

                    currentMessage = new Message(subject, contents, new java.util.Date());

                    System.out.println("Your message: " + currentMessage.displayMessage());
                    currentTopic.addMessage(currentMessage);
                    break;
                case 2:
                    System.out.println(currentTopic.displayTopic());
                    break;
                case 3:
                    System.out.println("Enter the index of the message to be deleted:");
                    int index = keyBoard.nextInt();
                    currentTopic.removeMessage(index);
                    break;
                case 4:
                    System.out.println("Leaving topic menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please enter one of the options above.");
                    option = 0;
            }

        } while (option != 4);
    }
}
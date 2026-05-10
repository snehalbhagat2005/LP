import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" Welcome to SmartShop ChatBot ");
        System.out.println("=================================");
        System.out.println("Type 'exit' to end the chat.\n");

        while (true) {

            System.out.print("You: ");
            String userInput = sc.nextLine().toLowerCase();

            // Exit condition
            if (userInput.equals("exit")) {
                System.out.println("Bot: Thank you for visiting SmartShop!");
                System.out.println("Bot: Have a nice day 😊");
                break;
            }

            // Greeting
            else if (userInput.contains("hello") || 
                     userInput.contains("hi")) {

                System.out.println("Bot: Hello! How can I help you?");
            }

            // Store timings
            else if (userInput.contains("time") || 
                     userInput.contains("hours")) {

                System.out.println("Bot: Our store is open from 9 AM to 9 PM.");
            }

            // Delivery information
            else if (userInput.contains("delivery")) {

                System.out.println("Bot: Delivery takes 3 to 5 business days.");
            }

            // Return policy
            else if (userInput.contains("return")) {

                System.out.println("Bot: Products can be returned within 30 days.");
            }

            // Order status
            else if (userInput.contains("order")) {

                System.out.println("Bot: Please enter your Order ID on our website to track your order.");
            }

            // Payment methods
            else if (userInput.contains("payment")) {

                System.out.println("Bot: We accept Credit Card, Debit Card, UPI, and Cash on Delivery.");
            }

            // Unknown input
            else {

                System.out.println("Bot: Sorry, I didn't understand that.");
                System.out.println("Bot: Please ask about delivery, orders, returns, timings, or payment.");
            }
        }

        sc.close();
    }
}
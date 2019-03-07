//Encryption Presentation
//March 7, 2019

//CaesarCipher

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String...s){
		//create empty strings for the message and empty message
    String message, encryptedMessage = "";
		//create an integer distance that will be used for the distance between changed letters
    int distance;
    char character;
    Scanner sc = new Scanner(System.in);
		//Scan for user's input after printing the following message
    System.out.println("Enter the word you would like encrypted: ");
    message = sc.nextLine();
    System.out.println("Enter your distance between these characters: ");
    distance = sc.nextInt();
		//Use for loop to change length between characters
    for(int i = 0; i < message.length(); ++i){
    //return character at i value
    character = message.charAt(i);
    if(character >= 'a' && character <= 'z'){
                character = (char)(character + distance);
                //shift character location for lowercase
                if(character > 'z'){
                    character = (char)(character - 'z' + 'a' - 1);
                }
                encryptedMessage += character;
            }
            //shift character location for uppercase
            else if(character >= 'A' && character <= 'Z'){
                character = (char)(character + distance);
                if(character > 'Z'){
                    character = (char)(character - 'Z' + 'A' - 1);
                }
                encryptedMessage += character;
            }
            else {
                encryptedMessage += character;
            }
    }
		//print out the encrypted message
    System.out.println("Here is your encrypted message... " + encryptedMessage);
    }
}

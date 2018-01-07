package main;
import java.util.concurrent.TimeUnit; 
import java.awt.Graphics; 
import javax.swing.JPanel

/** 
 * @author  Biko Pougala
 * @version 1.0
 * @date    29/12/2017

   */
  
public class MyPanel extends JPanel // create a Graphics object
{
    public void paintComponent(Graphics g) {
    }
}
public class MainActivity
{
  
    
   public static String getRandom(String[] array) {
      int random = new Random().nextInt(array.length); 
      
      return array[random]; 
   
   }
   
   public static void displayGame(String secret, Graphics console) {
       // play the game
      int cursor =  0; // to help determine where to draw each line 
      for (int i = 0; i < secret.length; i++) {
          if (displayedWord.indexOf(i).equals('x')) {
             console.drawLine(50,cursor+10,50,cursor+60); // draw a horizontal bar to symbolise the hidden letter
             cursor += 60; 
          } else {
            console.drawString(secret.indexOf(i), 50, cursor+10); // we draw the letter for the hint
            cursor += 10; 
          }       
      }
    }
       
   // convert the word into a string of x's and a few hints
   public static String displayWord(String secretWord) {
       displayedWord = []; 
       for (int i = 0; i < secretWord.length; i++) {
          if (i%3 == 0) {
              displayedWord = displayedWord + (secretWord.indexOf(i));           
          } else {
              displayedWord = displayedWord + 'x'; 
          } 
       }
       return displayedWord; 
   }
      
    
   public static void main(String[] args) {
       
      String[] password = {"aberration", "beguile", "blandishment","calumny","commensury","constituent","disparate",
      "empirical","paradigm"};
    
      // let the player introduce itself
      System.out.println("Hello, what's your name ?"); 
      String name = System.console().readLine(); 
   
      // wait 1 second before going forward
      TimeUnit.SECONDS.sleep(1); 
   
   String entry = String.format("Hello %s, let's get started!", name); 
   System.out.println(entry); 
   
   TimeUnit.SECONDS.sleep(3); 
   
   // generate the new secret word to be guessed
   String secretWord = getRandom(password); 
   
   newWord = displayWord(secretWord); 
   
   // display some characters of the secret word as hints 
   
   Graphics gameConsole; // graphics console that will open 
   
   displayGame(newWord, gameConsole); 
   
   boolean hung = false; 
   
   while(hung == false) {
       
      String s = System.console().readLine(); 
      char c = s.charAt(0); 
      
      if secretWord.contains(c) {
          // display the character instead of the line
        } else {
          // draw the hangman   
            
        }
      
   }
   
   
}

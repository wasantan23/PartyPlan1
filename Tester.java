/*given a file of people and their companies, sort into groups where no more than two people from the same compay sit together
people class 
table
collection of table object that contains people objects 
each person be a object 
we could have a class for company 
*/

//imporation code that I copied 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList
  
public class Tester {
  public static void main (String[] args) {
try {
File myObj = new File("names.csv"); //this file has 90 people 
Scanner scan = new Scanner(myObj);
}
catch (FileNotFoundException e){
System.out.println("error");
e.printStackTrace();
}

    for (int x = 0; x <11; x++) { //this goes through a for loop and manually creates 10 people
    // Main person = new person(); 
    //introduction to scanner statements 
	System.out.println("Welcome to the party." );
	System.out.println("We need to determine the table you are sitting at!");
	System.out.print("Please enter your name!");
	Scanner keyboard = new Scanner(System.in); // creating an instance of keyboard 
  String ans = keyboard.nextLine();  //takes in the answers
  System.out.print("Enter your company");
  String coAns = keyboard.nextLine(); 
      keyboard.nextLine(); //clears the buffers
    } //closes for loop
  } //closes main
}// closes class

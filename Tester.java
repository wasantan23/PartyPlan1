/*given a file of people and their companies, sort into groups where no more than two people from the same compay sit together
people class 
table
collection of table object that contains people objects 
each person be a object 
we could have a class for company 
get a tring find the next char at 
see the first time you find a comma 
that index will be the first end 
*/

//imporation code that I copied 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
  
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
//ois it possible to change the file names. to all upper caset
    //or should we assign a number for each company 
ArrayList<String> companies  = new ArrayList<String>();
ArrayList<String> names = new ArrayList<String>();
/*
    //ArrayList<ArrayList<String>> board = new 
    for(int y = 0; y< companies.size() ; y++)
      companies.get(y);
    

    for (int i = 0; i< names.size(); i ++ ) {
      names.get(i)
    }

    for (int x = 0; x < 11; x++) { //this goes through a for loop and manually creates 10 people
    // Main person = new person(); 
    //introduction to scanner statements 
*/
    ArrayList <String> x = new ArrayList<String>();
    Scanner sc = new Scanner(new File ());
    sc.useDelimiter(",");

    while ()
	System.out.println("Welcome to the party." );
	System.out.println("We need to determine the table you are sitting at!");
	System.out.print("Please enter your name, your !");

    //in this for loop, we are taking the inputs of a person and determining where the first comma is set. we then need to parse out this bit of information and figure out where the next comma is. this all helps us determine where thre name is in the information that was typed
  for (int i = 0; i < str.length ; i ++) {
    if (charAt(i) == "," ){
      id = String substring(0,i);
      //parse out a specific part
      
    }

    for (int )
  }
	Scanner keyboard = new Scanner(System.in); // creating an instance of keyboard 
  String ans = keyboard.nextLine();  //takes in the answers
  System.out.print("Enter your company");
  String coAns = keyboard.nextLine(); 
      keyboard.nextLine(); //clears the buffers
      //generate a random ID
    } //closes for loop
  } //closes main
}// closes class

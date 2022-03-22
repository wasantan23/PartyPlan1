//Tanisha Wasan & Suhani Gupta (21st Mar 2022)
import java.io.*; //add helper file for reading files
import java.util.ArrayList; //need this for array lists
import java.util.Scanner; //need this for scanner
public class Main { //main class
 
  //psvmsa
  public static void main (String[] args) throws IOException {  //add 'throws IOException" to handle errors
    String row; //variable in regards to line 13. reading the rows of the people in the list
    ArrayList<Person> party = new ArrayList<Person>(); //rather a string or an Integer, create a list of Person objects 
     //begin code given by mr. twyford
    BufferedReader csvReader = new BufferedReader(new FileReader("names.csv"));  //make sure file is in same folder (or use folder path in name
      while ((row = csvReader.readLine()) != null) {
          String[] data = row.split(","); //end code given by mr twyford
//this parses out each line into an array of strings, separating out by commas
 Person p1 = new Person(Integer.parseInt(data[0]), (data[1] + " , " + data[2]) , (Integer.parseInt(data[3]))); //takes in the data provided by the CVS file seperating tableID, last name, first name, and coID. 
        party.add(p1); //adds a person
        }
    
    csvReader.close(); //closes the reader
    
    for (int x = 0; x < 11; x++) { //this goes through a for loop and manually creates 10 people
    // Main person = new person(); 
    //introduction to scanner statements 
      Scanner keyboard = new Scanner(System.in); // creates instance of keyboard scanner
	System.out.println("Welcome to the party! You're going to have a blast!" ); 
	System.out.println("We need to determine the table you are sitting at.");
	System.out.println("Please enter your first name:");
    String ans = keyboard.nextLine();
    //takes in first name
    System.out.println("Please enter your last name:");
  String lastAns = keyboard.nextLine(); //takes in the last name
  System.out.println("Please enter your company ID: ");
  int coAns = keyboard.nextInt(); //takes in company ID
  keyboard.nextLine();//clears buffer    
      }
/* code we've been working on that would be used to generate a table ID for the 10 people inserted manually
String firstPos;
String secondPos; 
String thirdPos; 
String fourthPos; 
String fifthPos;
String sixthPos;
String seventhPos;
String eigthPos; 
String ninthPos;
String tenthPos;

     	int r = (int) (Math.random()  * 10);
		String[] arr = { "TB1", "TB2", "TB3", "TB4", "TB5", "TB6" , "TB7", "TB8", "TB9" , "TB10"}; //different 10 table 

		firstPos = arr[r];  //assigns the first position to a place in the array that was randomly generated
		int temp = (int) Math.random() *1000;
		r = (int)(Math.random()  * 10);
		secondPos = arr[r];

		while (firstPos.equals(secondPos)) { //checks to see if the second position repeats
			r = (int) (Math.random()  * 10);
			secondPos = arr[r];
			
		}
		r = (int) (Math.random()  * 10); //generates the third position
		thirdPos = arr[r];
		
		while (firstPos.equals(thirdPos) || secondPos.equals(thirdPos)) { // checks to see if the third position repeats
			r = (int) (Math.random()  * 10);
			thirdPos = arr[r];
		}
		r = (int) (Math.random()  * 10);
		fourthPos = arr[r];
		
		while (firstPos.equals(fourthPos) || secondPos.equals(fourthPos) || thirdPos.equals(fourthPos)) {  //checks to see if the fourth position repeats
			r = (int) (Math.random()  * 10);
			fourthPos = arr[r];
}
      r = (int) (Math.random()  * 10);
		fifthPos = arr[r];

while (firstPos.equals(fifthPos) || secondPos.equals(fifthPos) || thirdPos.equals(fifthPos) || fourthPos.equals(fifthPos)) {  //checks to see if the fifth  position repeats
			r = (int) (Math.random()  * 10);
			fifthPos = arr[r];
}

     r = (int) (Math.random()  * 10);
		 sixthPos = arr[r];

while (firstPos.equals(sixthPos) || secondPos.equals(sixthPos) || thirdPos.equals(sixthPos) || fourthPos.equals(sixthPos) || fifthPos.equals(sixthPos)) {  //checks to see if the sixth  position repeats
			r = (int) (Math.random()  * 10);
			sixthPos = arr[r];

}
     r = (int) (Math.random()  * 10;
		 seventhPos = arr[r];

while (firstPos.equals(seventhPos) || secondPos.equals(seventhPos) || thirdPos.equals(seventhPos) || fourthPos.equals(seventhPos) || fifthPos.equals(seventhPos) || sixthPos.equals (seventhPos)){  //checks to see if the seventh position repeats
			r = (int) (Math.random()  * 10);
			seventhPos = arr[r];

}
     r = (int) (Math.random()  * 10);
		 eigthPos = arr[r];

while (firstPos.equals(eigthPos) || secondPos.equals(eigthPos) || thirdPos.equals(eigthPos) || fourthPos.equals(eigthPos) || fifthPos.equals(eigthPos) || sixthPos.equals (eigthPos) || seventhPos.equals(eigthPos)) {
//checks to see if the eigth position repeats
  	r = (int) (Math.random()  * 10);
		eigthPos = arr[r];

}

     r = (int) (Math.random()  * 10);
		 ninthPos = arr[r];

while (firstPos.equals(ninthPos) || secondPos.equals(ninthPos) || thirdPos.equals(ninthPos) || fourthPos.equals(ninthPos) || fifthPos.equals(ninthPos) || sixthPos.equals (ninthPos) || seventhPos.equals(ninthPos) || eightPos.equals(ninthPos)) {
//checks to see if the ninth position repeats
  	r = (int) (Math.random()  * 10);
		ninthPos = arr[r];

}

  r = (int) (Math.random()  * 10);
		 tenthPos = arr[r];

while (firstPos.equals(tenthPos) || secondPos.equals(tenthPos) || thirdPos.equals(tenthPos) || fourthPos.equals(tenthPos) || fifthPos.equals(tenthPos) || sixthPos.equals (tenthPos) || seventhPos.equals(tenthPos) || eightPos.equals(tenthPos) || ninthPos.equals(tenthPos)) {
//checks to see if the tenth position repeats
  	r = (int) (Math.random()  * 10);
		tenthPos = arr[r];

}

        
        //to test = print out one element in the array       
          // do something with the data
            //next - call a new person object constuctor, and pass to it ID, name, and companyID
            //finally - add that person to the array list ( party.add(p1); )
  */    
  
  
    //in this for loop, we are taking the inputs of a person and determining where the first comma is set. we then need to parse out this bit of information and figure out where the next comma is. this all helps us determine where thre name is in the information that was typed   int [][] 
  int [][] tableArr = new int [10][10]; //creates a 2D array - 10 rows, 10 columns 
   int count = 0;
   int y = 0;
  for (int x = 0; x <=10; x ++) { //for loop to create the 10 tables
    for ( y= 0; y <=10; y ++ ) { //for loop to run through the list of people
      tableArr [y][x] = party.get(count).pID;
      count ++; 
    }
  }
y= y-10; //allowing us to iterate through list of names 90 times, not 100 because only 90 names in list
    } //closes main
} //closes class
  
      
/*public void manual() { //method for putting people at the table - stil working

  }

//PSEUDOCODE: trying to print out the table roster with the namers, instead of just referring to the person ID
print table roster:
To add complexity to the amount we have done, we wanted to add the ability to print the table rosters with the names of the people on each table instead of just the reference to their table ID. To start, we would begin with a for loop with the conditions that an int i is less than or equal to 10. This allows us to iterate through each of the 10 tables. We then introduce a while loop to allow us to enter the next for loop. This next for loop allows us to The thinking we would use in order ot print out the nakme to loop through a loop and figure out where the company ID is and then compare it.

boolean pfound == true;

  while (pfound) {
  for (p:party)
//print people @ table 3?
  for (int i = 0; i < = 10; i++){
print table[3] [i];
  }
}
Struggles and future goals:
While attempting this project, Tanisha and Suhani ran into multiple hurdles to overcome. In starting this project, Suhani was out of town. And so, Tanisha and Suhani facetimed during class periods and outside of class to make sure to devote as much time as possible. As we continued to run into hurdles, we met with Mr. Twyford multiple times, including during lunch periods and free bells. We realized some mistakes and fixed them, such as the amount of classes we had and the different for loops we had to incorporate that we struggled with. The main one being how to incorporate the names from the CV to the program itself and how to continuously call on them in hopes to assign the people to a table. We consulted outside sources, such a websites, videos, and runestone. Despite our hard efforts, we had a difficulty in making sure that the table assignments would be 2 people from the same company per table. And so, the last time we met with Mr. Twyford, he gave us the option to write a paragraph on a alternative complex route to solve the problem. We hope can continue to work on this after break and learn to continue to overcome the challenges.
*/
  
  

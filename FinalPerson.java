// Tanisha Wasan & Suhani Gupta (21st Mar 2022)
// class to construct 'people' objects which will be added to an ArrayList

public class Person { //person class
  
  //local variables
  int pID; //unique ID for each person
  String name; //name of each person
  int cID; //company ID -
  int tableID; //table ID
            
  
  //constructor takes three parameters to construct a 'person'
  public Person (int personID, String name, int companyID) {
      pID = personID; //personID is assigned to PID
      this.name = name; //this reference used when variable and argument/parameter are the same 
      cID = companyID;  //companyID is assigned to cID
  } //closes person method
  
  //a to string method 
  public String toString() {
    return (name + " has an ID of " + pID + " and is from comany " + cID );
     } //closes string method
  
}//closes class
       

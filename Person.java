/*import java.util.file
Public class Main {
  private String name;
  private String company; 
  private int people; 
  private String table;
  
  public Main (String name, String company, int table) {
    this.name = name;
    this.company = company;
    this.people = people;
      
  }
}
*/
public class Person { //person class
  int personID; //instances of varaibles that are being used in the constructor
  String name;
  int tableID;
  int companyID
  
public Person (int id, String name , int coID) { //overloaded constrcutor that takes in the id, name and coID
  this.personID = id; //we use .this to make sure we are not getting confused w/ the variable names
  this.name = pname;
  this.companyID = coID;
  } //closes the constructor
} //closes the main

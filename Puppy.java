public class Puppy{
  public Puppy(String name){
    //constructor with a single argument, name
    System.out.println("The name Passed is: "+ name);
  }
  public static void main (String args[]){
    //create an object myPuppy
    Puppy myPuppy = new Puppy("Tommy");
  }
}
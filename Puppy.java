public class Puppy{
  int puppyAge;

  public Puppy(String name){
    //constructor with a single argument, name
    System.out.println("The name Passed is: "+ name);
  }
  public void setAge(int age){
    /*set the age of puppy*/
    puppyAge = age;
  }

  public int getAge(){
    System.out.println("the age is: "+puppyAge);
    return puppyAge;
  }

  public static void main (String args[]){
    //create an object myPuppy
    Puppy myPuppy = new Puppy("Tommy");

    //To set the age of puppy
    myPuppy.setAge(4);

    // To obtain the age of puppy
    myPuppy.getAge();

    //Accessing instatnce variables
    System.out.println("The value of the instance variable is: " + myPuppy.puppyAge);

  }
}
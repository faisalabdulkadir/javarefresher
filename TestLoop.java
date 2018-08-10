public class TestLoop{

  public static void main(String args[]){
    int [] numbers = {20,30,40,50};

    for(int x : numbers){
      System.out.print(x);
      System.out.print(",");
    }

    System.out.print("\n");

    String [] names = {"james", "Larry", "Tom", "nelly", "Jerry"};

    for(String name : names){
      System.out.print(name);
      System.out.print(",");
    }
    
    System.out.print("\n");
  }
}
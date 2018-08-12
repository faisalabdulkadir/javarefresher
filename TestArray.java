public class TestArray {

  public static void main(String args[]){
    double[] myStuff = new double[10];

    double[] myList = {1.9,2.9,3.4,3.5};

    //print all the array elements
    for(int i = 0; i < myList.length; i++){
      System.out.println(myList[i] + " ");
    }

    //Summing all elements
    double total = 0;
    for(int i = 0; i < myList.length; i++){
      total += myList[i];
    }
    System.out.println("Total is: " + total);

    //finding the largest element
    double max = myList[0];
    for(int i = 0; i < myList.length; i++){
      if(myList[i] > max) max = myList[i];
    }
    System.out.println("max is: " + max);

    
  }
}
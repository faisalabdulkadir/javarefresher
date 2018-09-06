import java.util.*;
import java.text.*;

public class DateDemo1{

  public static void main (String args[]){
    Date dnow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("E YYYY.MM.DD 'at' hh.mm.ss a zzz");
    System.out.println("Current date and time: " + ft.format(dnow));
  }
}
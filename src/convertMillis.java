import java.util.Scanner;

public class convertMillis {
  public static void main(String[] args){
    System.out.print("Enter number of milliseconds: ");
    Scanner input = new Scanner(System.in);
    long millis = input.nextLong();
    
    System.out.println(millis + " milliseconds in hours, minutes, and seconds "
            + "is " + convertMillis(millis));
  } // main   
  
  public static String convertMillis(long millis){
    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSeconds = millis / 1000;
 
    // Compute the current second in the minute in the hour
    long currentSecond = totalSeconds % 60;
 
    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;
 
    // Compute the current minute in the hour
    long currentMinute = totalMinutes % 60;
 
    // Obtain the total hours
    long totalHours = totalMinutes / 60;
 
    return totalHours + ":" + currentMinute + ":" + currentSecond;
  } // convertMillis method
} // convertMillis class

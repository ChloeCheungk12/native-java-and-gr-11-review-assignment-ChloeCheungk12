package gr11review.part1;
import java.io.*;

public class Review1{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    // Declare variables
    int intMonth;
    int intDay;
    int intNumDays;

    // Initialize Variable
    intNumDays = 0;
    
    // Get inputs
    System.out.print("Enter the month number: ");
    intMonth = Integer.parseInt(key.readLine());
    System.out.print("Enter the day number: ");
    intDay = Integer.parseInt(key.readLine());


    // for loop that add the number of days in each month that passes
    for (int intCount = 1; intCount < intMonth; intCount++) {
      if (intCount == 2) {
        intNumDays += 28;
      } 
      else if (intCount == 4 || intCount == 6 || intCount == 9 || intCount == 11) {
        intNumDays += 30;
      } 
      else {
        intNumDays += 31;
      }
    }
    
    // Output the number of days
    System.out.println(intNumDays + intDay);
  }
}

import java.util.Calendar;
import java.util.*;


class Result {

    public static String findDay(int month, int day, int year) {
      Calendar cal = Calendar.getInstance();
      cal.set(Calendar.DAY_OF_MONTH, day);
      cal.set(Calendar.MONTH, month-1);
      cal.set(Calendar.YEAR, year);
      int i =  cal.get(Calendar.DAY_OF_WEEK);
      String[] str = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
      return str[i-1];
    }

}

public class day {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter date: ");
      int day = sc.nextInt();
      System.out.print("enter month: ");
      int month = sc.nextInt();  
      System.out.print("enter year: ");
      int year = sc.nextInt();  
    
      String ans = Result.findDay(month, day, year);

        System.out.println(ans);
 
        
    }
}

import java.util.Scanner;

public class try_2 {
    
    public static void main(String[] args) {
      int attempt = 2;
      Scanner sc = new Scanner(System.in); 
      boolean play = sc.nextBoolean();
      attempt = checkplay(attempt,play);
      System.out.println(attempt);     
    }
    
}

import java.util.Scanner;

public class code_to_string_is_pollendrom_or_not {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        char[] cAr = s.toCharArray();
        String s_rev ="";
        for(int i = (s.length()-1);i>=0;i--){
            s_rev = s_rev + cAr[i];

        }
        System.out.println(s_rev);
        if(s_rev.equals(s)){
            System.out.println("string is  pollendrom");
        }
        else
        System.out.println("string is not pollendrom");
    }
    
}

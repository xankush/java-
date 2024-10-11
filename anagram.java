import java.util.*;
public class anagram {
  static   boolean same = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string one ");
        String s1 = sc.nextLine();
        System.out.println("Enter string two ");
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] s1_c = s1.toCharArray();
        char[] s2_c = s2.toCharArray();

        
        Arrays.sort(s1_c);
        Arrays.sort(s2_c);

        // System.out.println(s1_c);
        // System.out.println(s2_c);
        if(s1_c.length==s2_c.length){
        for(int i = 0;i<s1.length();i++){
            if(s1_c[i]!=s2_c[i]){
                same =false;
            }
        }
    }else 
    same=false;

         
        if(same == false)
        System.out.println("not anagram");
        else{
        System.out.println("is anagram");
        }


    }
    
}

import java.util.*;
import java.lang.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores  ;
    public Student(String firstName,String lastName,int idNumber,int testScores[]){
        
        super(firstName, lastName, idNumber);
        this.testScores = new int[testScores.length];
        for (int i = 0; i < testScores.length; i++) {
            // System.out.print(testScores[i] + " ");
            this.testScores[i] =testScores[i]; 
            // this.testScores[i] = testScores[i];
        }
    }
     char calculate(){
        int add=0;
        // int [] testScore =this.testScores[];
        for(int i =0 ;i<testScores.length;i++){
            add = add + testScores[i];
        }
        int average= add/testScores.length;
        // System.out.println(average);
        if(average >=90&&average<=100){
         return 'O';
        }  
        else if(average >=80&&average<90) {
            return 'E';

        }
        else if(average >=70&&average<80) {
            return 'A';

        }
        else if(average >=55&&average<70) {
            return 'P';

        }
        else if(average >=40&&average<55) {
            return 'D';

        }
        else {
            return 'T';
        }
     }    
}
class an {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
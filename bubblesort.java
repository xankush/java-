import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        // sor bubble sort
        int i, temp, swap = 0, j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        n= sc.nextInt();
        // inputing array

        int[] unsorted = new int[n];
        System.out.println("Enter the elements of array");
        for (i = 0; i < n; i++) {
            unsorted[i] = sc.nextInt();
        }

        for (j = 0; j < (n-1); j++) {

            for (i = 0; i < (n-1); i++) {
                if (unsorted[i] > unsorted[i + 1]) {
                    // swap
                    temp = unsorted[i + 1];
                    unsorted[i + 1] = unsorted[i];
                    unsorted[i] = temp;

                    swap++;

                }
            }
        
        }
        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: "+ unsorted[0]);
        System.out.println("Last Element: "+ unsorted[n-1]);
        
}
}


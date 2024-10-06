import java.util.Scanner;
import java.util.Scanner;

public class hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[6][6]; 
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                a[i][j] = sc.nextInt();
            }
            
        }
        int key =0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(a[i][j]>=-9&&a[i][j]<=9){
                    key = 1;
                }
            }
        }
        if(key==1){       
        int[] sum = new int[20];
        int n = 0, r = 0, k = 0;
        for (n = 0; n < 4; n++) {
            for (r = 0; r < 4; r++) {
                sum[k] = a[n][r] + a[n][r + 1] + a[n][r + 2] + a[n + 2][r] + a[n + 2][r + 1] + a[n + 2][r + 2]
                        + a[n + 1][r + 1];
                k++;
            }
        }
        boolean neg=true;
        for(k=0;k<16;k++){
            if(sum[k]>=0){
                neg=false;
            }
        }
        
        int max_sum = sum[0];
        if(neg==false){
        for (k = 0; k < 20; k++) {
            // System.out.print(sum[k] + " ");
            if (max_sum < sum[k]) {
                max_sum = sum[k];
            }
        }
        }
        if(neg==true){
            for (k = 0; k < 16; k++) {
            // System.out.print(sum[k] + " ");
            if (max_sum < sum[k]) {
                max_sum = sum[k];
            }
        }
        }
        System.out.println(max_sum);
    }
}
}
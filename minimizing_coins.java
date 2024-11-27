import java.util.*;

public class minimizing_coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int DP[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            DP[i][0] = 0;
        }
        for(int i=0;i<=m;i++){
            DP[0][i] = Integer.MAX_VALUE/2;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(arr[i-1]>j){
                    DP[i][j] = DP[i-1][j];
                }
                else{
                    DP[i][j] = Math.min(DP[i-1][j], DP[i][j-arr[i-1]]+1);
                }
                
            }
        }

        System.out.println(DP[n][m]);

        sc.close();
    
    }
    
}

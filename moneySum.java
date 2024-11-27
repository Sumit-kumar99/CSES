import java.util.*;

public class moneySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        boolean[][] dp = new boolean[n][sum+1];

        for(int i=0;i<n;i++){
            dp[i][0] = true;
        }

        if (arr[0] <= sum) {
            dp[0][arr[0]] = true;
        }
        

        for(int i=1;i<n;i++){
            for(int j=1;j<=sum;j++){
                dp[i][j] = dp[i-1][j];
                if(j>=arr[i] && !dp[i][j]) dp[i][j] = dp[i-1][j-arr[i]];
            }
        }
        int count = 0;
        for(int i=1;i<=sum;i++){
            if(dp[n-1][i])count++;
        }
        System.out.println(count);
        for(int i=1;i<=sum;i++){
            if(dp[n-1][i])
            System.out.print(i+" ");
        }


    }
    
}
import java.util.Scanner;

public class countingtowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), mod = (int)(1e9+7);
            long [][] dp = new long[n][2];
            dp[0][0] = 1L;
            dp[0][1] = 1L;

            for(int i=1;i<n;i++){
                dp[i][0] = (2L * dp[i-1][0] + dp[i-1][1]) % mod;
                dp[i][1] = (4L * dp[i-1][1] + dp[i-1][0]) % mod;

            }

            System.out.println(((dp[n-1][0]+dp[n-1][1]))%mod);

        }
    }
}
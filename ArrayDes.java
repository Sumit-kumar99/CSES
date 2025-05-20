import java.util.*;
public class ArrayDes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        

        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==j){
                    dp[i][j] = 0;
                    continue;
                }

                for(int p=1;p<=j-1;p++){
                    dp[i][j] = Math.min(dp[i][j], dp[i][j-p]+dp[i][p]+1);
                }
                for(int p=1;p<=i-1;p++){
                    dp[i][j] = Math.min(dp[i][j], dp[i-p][j]+dp[p][j]+1);
                }
            }
        }

        System.out.println(dp[n][m]);
        
    }

    
}
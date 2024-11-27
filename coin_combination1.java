import java.util.*;

public class coin_combination1 {
    static final int mod = 1000000007;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        sc.nextLine();
        int[] coins = new int[n];
        for(int i=0;i<n;i++) coins[i] = sc.nextInt();

        int[] dp = new int[target+1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        
        for(int i=1;i<=target;i++){
            for(int c : coins){
                if(i>=c)
                dp[i]  = dp[i] + dp[i-c];
            }
        }
        System.out.println(dp[target]);
    }

}

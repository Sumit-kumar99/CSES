import java.util.*;

public class Dice_combination {
    
    public static void main(String[] args) {
        
        int mod = (int) 1e9+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int DP[] = new int[n+1];
        DP[0] = 1; 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(i>=j)
                    DP[i] = (DP[i] + DP[i-j])%mod;
            }
        }
        System.out.println(DP[n]);
        sc.close();
    }
}

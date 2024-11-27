import java.util.*;
public class bookShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] price = new int[n];
        int[] pages = new int[n];

        for(int i=0;i<n;i++) price[i] = sc.nextInt();
        for(int i=0;i<n;i++) pages[i] = sc.nextInt();
        
        int[][] DP = new int[n+1][m+1];
        
        for(int i=0;i<n;i++) DP[i][0] = 0;
        for(int i=0;i<m;i++) DP[0][i] = 0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j<price[i-1]){
                    DP[i][j] = DP[i-1][j];
                }
                else{
                    DP[i][j] = Math.max(DP[i-1][j], pages[i-1] + DP[i-1][j-price[i-1]]);
                }
            }
        }
        System.out.println(DP[n][m]);

    }
}

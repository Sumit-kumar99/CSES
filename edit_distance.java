import java.util.*;

public class edit_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int n = s1.length();
        int m = s2.length();

        int DP[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            DP[i][0] = i;
        }
        for(int i=0;i<=m;i++){
            DP[0][i] = i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    DP[i][j] = DP[i-1][j-1];
                }
                else{
                    DP[i][j] = 1+Math.min(DP[i-1][j-1], Math.min(DP[i][j-1], DP[i-1][j]));
                }
            }
        }

        System.out.println(DP[n][m]);
        sc.close();
    }
}

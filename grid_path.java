import java.util.*;

public class grid_path {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] c = new char[n][n];
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            c[i] = str.toCharArray();
        }
        int DP[][] = new int[n][n];
        for(int i=0;i<n;i++){
            if(c[0][i]=='*') break;
            else DP[0][i] = 1;
        }
        for(int i=0;i<n;i++){
            if(c[i][0]=='*') break;
            else DP[i][0] = 1;
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(DP[i][j]=='*') continue;
                DP[i][j] = DP[i-1][j]+DP[i][j-1];
            }
        }
        System.out.println(DP[n-1][n-1]);

    }
}
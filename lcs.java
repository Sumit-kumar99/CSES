import java.util.*;
public class lcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[m];

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<m;i++) brr[i] = sc.nextInt();

        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i], 0);
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(arr[i-1] == brr[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int i = n, j = m;
        while(i > 0 && j > 0) {
            if(arr[i - 1] == brr[j - 1]) {
                list.add(arr[i - 1]);
                i--;
                j--;
            } else if(dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        Collections.reverse(list);
        System.out.println(dp[n][m]);
        for(int k=0;k<list.size();k++)System.out.print(list.get(k)+" ");

        
    }

    
}
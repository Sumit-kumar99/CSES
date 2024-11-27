import java.util.*;

public class counting_rooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] adj = new char[n][m];

        for(int i=0;i<n;i++){
            String line = sc.nextLine();
            for(int j=0;j<m;j++){
                adj[i][j] = line.charAt(j);
            }
        }
        
        int[][] vis = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(adj[i][j] == '#'){
                    vis[i][j] = 1;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(adj[i][j]=='.' && vis[i][j]==0){
                    count++;
                    dfs(adj,vis,i,j,n,m);
                }
            }
        }

        System.out.println(count);
        sc.close();

    }

    private static void dfs(char[][] adj, int[][] vis, int i, int j, int n , int m) {
        vis[i][j] = 1;
        int[] nRow = {-1,1,0,0};
        int[] nCol = {0,0,1,-1};
        for(int k=0;k<4;k++){
            int nR = nRow[i]+i;
            int nC = nCol[i]+j;
            if(nR>=0 && nR<n && nC>=0 && nC<m && vis[nR][nC]==0 && adj[nR][nC]=='.')dfs(adj, vis, i, j, nC, m);
        }

    }
}
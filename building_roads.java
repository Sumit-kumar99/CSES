import java.util.*;

public class building_roads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
            sc.nextLine();
        }
        int count=0;
        int vis[] = new int[n+1];
        List<Integer> representatives = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(vis[i]==0){
                representatives.add(i);
                dfs(i,vis,list);
            }

        }
        
        int k = representatives.size() - 1;
        System.out.println(k);

        for (int i = 1; i < representatives.size(); i++) {
            System.out.println(representatives.get(i - 1) + " " + representatives.get(i));
        }
    }
                
    private static void dfs(int i, int[] vis, ArrayList<ArrayList<Integer>> list) {
        vis[i] = 1;
        for(int node : list.get(i)){
            if(vis[node]==0)
            dfs(node, vis, list);
        }

    }
}
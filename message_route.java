import java.util.*;

public class message_route {
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

        int[] vis = new int[n+1];
        int dist[] = new int[n+1];
        int parent[] = new int[n+1];
        bfs(1,vis,parent,list,dist);
        
        if(dist[n]==0){
            System.out.println("IMPOSSIBLE");
            return;
        }

        System.out.println(dist[n]);

        ArrayList<Integer> ans = new ArrayList<>();
        int current = n;
        while (current!=0) {
            ans.add(current);
            current = parent[current];
        }
        Collections.reverse(ans);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        
        }
        
        private static void bfs(int i, int[] vis, int[] parent, ArrayList<ArrayList<Integer>> list, int[] dist) {
                
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            vis[i] = 1;
            dist[i] = 1;
            while (!q.isEmpty()) {
                int data = q.poll();

                for(int node : list.get(data)){
                    if(vis[node]==0){
                        q.add(node);
                        vis[node]=1;
                        dist[node]= dist[data]+1;
                        parent[node] = data;
                    }
                }
            }
        }    
}

import java.util.*;

public class money_sums {


    static TreeSet<Integer> s = new TreeSet<>();
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
    
            int[] coins = new int[n];
            for(int i=0;i<n;i++){
                coins[i] = sc.nextInt();
            }
            solve(0,coins,n,0);
            for(int i : s) System.out.print(i+" ");
        }

            private static void solve(int ind, int[] coins, int n, int val) {
                    if(ind>=n){
                        if(val>0) s.add(val);
                        return;
                    }
                    
                    solve(ind+1, coins, n, val+coins[ind]);
                    solve(ind+1, coins, n,val);
        }    
}
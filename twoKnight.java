import java.util.*;
public class twoKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int k=1;k<=n;k++){
            long totalWays = (long)(k*k)*(long)(k*k-1)/2;
            long attackingways = 4*(long)(k-1)*(long)(k-2);

            System.out.println(totalWays-attackingways);
        }
    }

}

import java.util.*;
public class collectingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] hash = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            hash[arr[i]] = i;
        }

        int count = 1;
        hash[0] = -1;
        for(int i=1;i<=n;i++) if(hash[i]<hash[i-1])count++;
        System.out.println(count);

    }
}

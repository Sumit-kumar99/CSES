import java.util.*;
public class collectingNumberII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] hash = new int[n+1];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            hash[arr[i]] = i;
        }

        int count = 1;
        hash[0] = -1;
        for(int i=1;i<=n;i++) if(hash[i]<hash[i-1])count++;

        while(m-- > 0){
            int i = sc.nextInt();
            int j = sc.nextInt();

            if()

            int temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;



        }

    }
}

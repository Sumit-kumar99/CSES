import java.util.*;

public class stickLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }      
        long sum = 0;
        Arrays.sort(arr);
        int median = (n/2);
        for(int i=0;i<n;i++){
            sum+=Math.abs(arr[i]-arr[median]);
        }
        System.out.println((sum));
    }
}

import java.util.*;

public class kadaneMaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long max = Long.MIN_VALUE;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
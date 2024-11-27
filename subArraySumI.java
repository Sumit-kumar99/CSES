import java.util.*;

public class subArraySumI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        long[]arr = new long[n];
        ArrayList<Long> list = new ArrayList<>();
        long sum = 0;
        list.add(0L);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
            list.add(sum);
        }

        int i=0,j=0;
        int count = 0;
        while(j<=n){
            if(list.get(j)-list.get(i)==target){
                count++;
                i++;
            }
            else if(list.get(j)-list.get(i)<target) j++;
            else if(list.get(j)-list.get(i)>target)i++;
        }
        System.out.println(count);
    }    
}

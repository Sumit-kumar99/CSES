import java.util.*;

public class nearestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int store[] = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]<arr[s.peek()]){
                store[s.peek()]=i+1;
                s.pop();
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            store[s.peek()] = 0;
            s.pop();
        }
        for(int i=0;i<n;i++){
            System.out.print(store[i]+" ");
        }

    }
}

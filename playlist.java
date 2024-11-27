import java.util.*;
public class playlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Set<Integer> s = new HashSet<>();
        int i=0,j=0,max=0;
        while(i<n && j<n){
            while(j<n  && !s.contains(arr[j])){
                s.add(arr[j]);
                max = Math.max(max, j-i+1);
                j++;
            }
            while (j<n && s.contains(arr[j])) {
                s.remove(arr[i]);
                i++;
            }
        }
        System.out.println(max);
    
    }
}

/*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> m = new HashMap<>();
        int max = 0;
        int i=0,j=0;
        while (j<n) {
            if(m.containsKey(arr[j]) && m.get(arr[j]) >= i){
                int val = m.get(arr[j])+1;
                while (i<val) {
                    m.remove(arr[i]);
                    i++;
                }
                i = m.get(arr[j])+1;
            }
            m.put(arr[j], j);
            max = Math.max(max, j-i+1);
            j++;
        }
        
        System.out.println(max); 
*/

import java.util.*;
public class apartments {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();

    int[] arrN = new int[n];
    int[] arrM = new int[m];
    
    for(int i=0 ; i<n ; i++) arrN[i] = sc.nextInt();
    for(int i=0 ; i<m ; i++) arrM[i] = sc.nextInt();

    Arrays.sort(arrN);
    Arrays.sort(arrM);
    int i=0,j=0,count=0;
    while(i<n && j<m){
        if(arrN[i]-k <= arrM[j] &&  arrN[i]+k >= arrM[j]){
            count++;
            i++;
            j++;
        }
        else if(arrN[i]+k > arrM[j]) j++;
        else i++;
    }

    System.out.println(count);

    }
}

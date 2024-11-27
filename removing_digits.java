import java.util.*;

public class removing_digits
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int k = solve(n);
            count++;
            n = n-k;
        }
        System.out.println(count);
	}

    static int solve(int n){
        int t = 0;
        while(n>0){
            t = Math.max(n%10, t);
            n = n/10;
        }
        return t;
    }
}

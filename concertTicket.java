import java.util.*;
public class concertTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> price = new ArrayList<>();
        for(int i=0;i<n;i++) {
            price.add(sc.nextInt());
        }    
        Collections.sort(price);

        for(int i=0;i<m;i++){
            int temp = sc.nextInt();
            if(price.size()==0){
                System.out.println(-1);
                continue;
            }
            int mid = bS(price, temp);
            if(mid == -1){
                System.out.println(-1);
                continue;
            }
            System.out.println(price.get(mid));
            price.remove(price.get(mid));
        }


    }

    static int bS(ArrayList<Integer> price, int data){
        int l = 0;
        int r = price.size()-1;
        int mid = (l+r)/2;
        while (l<=r) {
            mid = (l+r)/2;
            if(price.get(mid)==data) return mid;
            else if(price.get(mid)>data) r=mid-1;
            else if(price.get(mid)<data) l=mid+1;
        }
        return r;
    }
}

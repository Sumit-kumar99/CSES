import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumTowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of cubes
        ArrayList<Integer> towers = new ArrayList<>(); // List to store the tops of towers

        for (int i = 0; i < n; i++) {
            int cube = sc.nextInt();
            if(towers.contains(cube)) towers.add(cube);
            
            int pos = Collections.binarySearch(towers, cube);

            if (pos < 0) pos = -(pos + 1); 
            
            if (pos == towers.size()) {
                towers.add(cube);
            } else {
                towers.set(pos, cube);
            }
        }

        // The size of the towers list is the minimum number of towers
        System.out.println(towers.size());
        sc.close();
    }
}

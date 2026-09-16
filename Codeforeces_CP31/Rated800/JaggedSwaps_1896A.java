package Codeforeces_CP31.Rated800;
import java.util.*;
public class JaggedSwaps_1896A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();

            int [] arr = new int[n];

            for(int i = 0; i < arr.length;i++)
            {
                arr[i] = sc.nextInt();
            }

            System.out.println(arr[0] == 1 ? "YES" : "NO");
        }
    }
}

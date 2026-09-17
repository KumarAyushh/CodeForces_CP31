package Codeforeces_CP31.Rated800;
import java.util.*;
public class AmbitiousKid_1866A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            minVal = Math.min(minVal, Math.abs(x));
        }
        System.out.println(minVal);
    }
}

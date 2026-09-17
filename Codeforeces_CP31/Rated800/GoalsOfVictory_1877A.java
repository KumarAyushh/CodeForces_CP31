package Codeforeces_CP31.Rated800;
import java.util.*;
public class GoalsOfVictory_1877A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 0; i < n-1; i++)
            {
                int efficiency = sc.nextInt();
                sum += efficiency;
            }

            System.out.println(-sum);
        }
    }
}
// Intuition:
// The total sum of all teams' efficiencies is always 0.
//
// Why?
// Whenever one team gains efficiency (+x), another team loses
// the same amount (-x).
//
// Example:
// A beats B by 5 → A = +5, B = -5
// C beats D by 3 → C = +3, D = -3
//
// Total = +5 - 5 + 3 - 3 = 0
//
// Therefore:
// e1 + e2 + ... + e(n-1) + missing = 0
//
// So:
// missing = -(e1 + e2 + ... + e(n-1))
//
// We calculate the sum of the given n-1 efficiencies
// and print -sum to get the missing efficiency.
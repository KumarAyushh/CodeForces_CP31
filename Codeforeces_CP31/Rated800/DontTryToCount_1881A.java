package Codeforeces_CP31.Rated800;

import java.util.*;

public class DontTryToCount_1881A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String s = sc.next();
            String t = sc.next();

            int ans = 0;

            while (s.length() < m) {
                s += s;
                ans++;
            }

            if (s.contains(t)) {
                System.out.println(ans);
            } else {
                s += s;
                ans++;

                if (s.contains(t)) {
                    System.out.println(ans);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
// Even if s.length() >= t.length(), t may not be a substring yet.
// Example: s = "ab", t = "ba"
// "ba" appears only after doubling: "ab" -> "abab"
// It crosses the boundary between the two copies: "ab | ab"
// So we check one extra doubling before returning -1.

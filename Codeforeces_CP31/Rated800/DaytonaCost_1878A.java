package Codeforeces_CP31.Rated800;
import java.util.*;
public class DaytonaCost_1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean flag = false;

            for(int i = 0;  i < n; i++)
            {
               int x = sc.nextInt();
               if(x == k)
               {
                   flag = true;
               }
            }
            System.out.println(flag ? "Yes": "No");


        }
    }
}
// Learning:
// 1. Scanner.nextInt() reads the next integer regardless of line breaks.
// 2. `break` only exits the current loop; it does NOT skip remaining input.
// 3. In multiple test cases, always consume all input belonging to the current test case.
// 4. If we find the answer early, we can set a flag and avoid further processing,
//    but still need to read the remaining elements.
// 5. Scanner continues from where it stopped; it does not reset for each test case.
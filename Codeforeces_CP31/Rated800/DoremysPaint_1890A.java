package Codeforeces_CP31.Rated800;
import java.util.*;
public class DoremysPaint_1890A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();

            int [] arr = new int[n];
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }

            if(map.size() > 2)
            {
                System.out.println("No");
                continue;
            }
            else if(map.size() == 1)
            {
                System.out.println("yes");
                continue;
            }

            int freq1 = 0;
            int freq2 = 0;

            for(int freq: map.values())
            {
                if(freq1 == 0)
                {
                    freq1 = freq;
                }
                else{
                    freq2 = freq;
                }

            }
            System.out.println(Math.abs(freq1 - freq2) <= 1 ? "Yes" : "No");

        }
    }
}


// In a good array:
// b1 + b2 = b2 + b3 => b1 = b3
// Therefore, elements must alternate between at most 2 distinct values.
// 3+ distinct values -> NO.
// With 2 values, their frequencies must differ by at most 1.
//as 1,2,2,2 will not be good or made good but 1,2,1 is good or such arrangements can be made good
// With 1 distinct value -> YES.
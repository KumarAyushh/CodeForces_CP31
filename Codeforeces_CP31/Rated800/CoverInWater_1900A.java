package Codeforeces_CP31.Rated800;

import java.util.*;

public class CoverInWater_1900A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int str_len = sc.nextInt();
            String s = sc.next();
            int emptyCounter = 0;
            int threeInRow = 0;
            boolean emptyThree = false;
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == '.')
                {
                    emptyCounter++;
                    threeInRow++;

                    if(threeInRow == 3)
                    {
                        emptyThree = true;
                        break;
                    }
                }
                else{
                    threeInRow = 0;
                }
            }
            if(emptyThree)
            {
                System.out.println(2);
            }
            else{
                System.out.println(emptyCounter);
            }



        }
    }
}



//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int t = sc.nextInt();
//
//
//        while (t-- > 0) {
//            ArrayList<Integer> st = new ArrayList<>();
//            int n = sc.nextInt();
//            int x = sc.nextInt();
//
//            System.out.println();
//            while(n-- > 0)
//            {
//                int stations = sc.nextInt();
//                st.add(stations);
//            }
//            int ans = Integer.MIN_VALUE;
//            int i = 0;
//            int j = 0;
//            int val = 0;
//            while(j <= st.size())
//            {
//                if(j == st.size())
//                {
//                    val = 2 * (x - st.get(j -1));
//
//                }
//                else
//                    val = st.get(j) - i;
//
//
//                ans = Math.max(ans, val);
//                if(j != st.size())
//                {
//                    i = st.get(j);
//                }
//
//
//
//                j++;
//            }
//            System.out.println(ans);
//
//
//
//
//        }
//        sc.close();
//    }
//}
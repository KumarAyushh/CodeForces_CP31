package Codeforeces_CP31.Rated800;
import java.util.*;
public class TargetPractice_1873C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int sum = 0;

            for (int i = 0; i < 10; i++) {

                String row = sc.next();

                for (int j = 0; j < 10; j++) {

                    char c = row.charAt(j);

                    if (c == 'X' && (i == 0 || i == 9 || j == 0 || j == 9)) {
                        sum += 1;
                    }
                    else if (c == 'X' && (i == 1 || i == 8 || j == 1 || j == 8)) {
                        sum += 2;
                    }
                    else if (c == 'X' && (i == 2 || i == 7 || j == 2 || j == 7)) {
                        sum += 3;
                    }
                    else if (c == 'X' && (i == 3 || i == 6 || j == 3 || j == 6)) {
                        sum += 4;
                    }
                    else if (c == 'X') {
                        sum += 5;
                    }
                }
            }

            System.out.println(sum);
        }

        sc.close();
    }
}

//BETTER WAY TO DO IT

// Intuition:
// The 10x10 grid has 5 layers (rings).
//
// Layer 1 → outermost border → score 1
// Layer 2 → next ring        → score 2
// Layer 3 → middle ring      → score 3
// Layer 4 → next ring        → score 4
// Layer 5 → center 2x2       → score 5
//
// For any cell (i, j), its layer is determined by its
// minimum distance from the four borders.
//
// Distance from:
// top    = i
// bottom = 9 - i
// left   = j
// right  = 9 - j
//
// So:
// layer = min(i, 9-i, j, 9-j)
//
// Since layers are 0-indexed, score = layer + 1.
//
// Example:
// For cell (0, 5):
// min(0, 9, 5, 4) = 0 → layer 1 → score 1
//
// For cell (2, 4):
// min(2, 7, 4, 5) = 2 → layer 3 → score 3
//
// For cell (4, 4):
// min(4, 5, 4, 5) = 4 → layer 5 → score 5
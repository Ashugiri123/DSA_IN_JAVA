package Contests;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                int gre = 0;
                int small = 0;

                for (int j = i + 1; j < n; j++) {
                    if (a[j] > a[i]) gre++;
                    else if (a[j] < a[i]) small++;
                }

                ans[i] = Math.max(gre, small);
            }

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

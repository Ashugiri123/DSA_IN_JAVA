package Contests;

import java.util.*;

public class FlipFlop {

    public static int otterZ(int n, int c, int k, int[] a){

        for(int i = 0; i < n; i++){

            // use k carefully
            while(a[i] < c && k > 0){
                a[i]++;
                k--;
            }

            // absorb if possible
            if(a[i] <= c){
                c += a[i];
                a[i] = 0;
            }
        }

        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int finalPower = otterZ(n, c, k, a);
            System.out.println(finalPower);
        }
    }
}
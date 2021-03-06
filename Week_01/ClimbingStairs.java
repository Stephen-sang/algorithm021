package pers.cloud.FirstWeek;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            second += first;
            first = second - first;
        }
        return second;
    }
}

public class P70ClimbingStars {
    public static int climbStairs(int n){
        if (n <= 2)
            return n;
        int last = 1;
        int prev = 2;
        int curr = 0;
        for (int i=3; i<=n; i++){
            curr = last + prev;
            last = prev;
            prev = curr;
        }
        return curr;
    }
}

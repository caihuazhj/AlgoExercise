package dp;

/**
 * 如果我们有面值为1元、3元和5元的硬币若干枚，如何用最少的硬币凑够11元？
 */
public class Coin {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int value = 11;

        int[] dp = new int[value+1];
        for (int i=0;i<=value;i++){
            dp[i] = i;
        }

        for (int i=0;i<=value;i++){
            for (int j=0;j<3;j++){
                // 初dp[i] 始化一个很大的数值。当最后如果得出的结果是这个数时，说明凑不出来。
                if(i >= a[j] && dp[i - a[j]] + 1 < dp[i]) {
                    dp[i] = 1 + dp[i - a[j]];
                }
            }
        }
        System.out.println(dp[value]);
    }
}

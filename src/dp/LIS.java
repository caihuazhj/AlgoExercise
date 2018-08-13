package dp;

import java.util.Scanner;

/**
 * longest increasing subsequence
 */
public class LIS {
    public static void main(String[] args) {
       int[] a = {5,3,4,8,6,7};
        System.out.println(lis(a));

    }
    public static int lis(int[] a){
        int res = 1;
        int[] dp = new int[a.length];

        for (int i=0;i<dp.length;i++){
            dp[i] =1;
            for (int j=0;j<i;j++){
                if (a[j]<a[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    public int lengthOfLIS(int[] nums) {
        if (nums.length ==0){
            return 0;
        }
        int res = 1;
        int[] dp = new int[nums.length];

        for (int i=0;i<dp.length;i++){
            dp[i] = 1;
            for (int j=0;j<i;j++){
                if (nums[i]>nums[j]){ //前边存在比他小的数的子序列长度
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(dp[i],res);
        }
        return res;
    }
}

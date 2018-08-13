package dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 将一个由N行数字组成的三角形，
 * 如图所示，设计一个算法，计算出三角形的由顶至底的一条路径，使该路径经过的数字总和最大。
 *
 * 5 第一行输入，三角形层数
 *
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 */
public class NumberTraingle {

    //自底向上
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i=n-1;i>0;i--){
            for (int j=0;j<i;j++){
                a[i-1][j] += Math.max(a[i][j],a[i][j+1]);
            }
        }

        System.out.println(a[0][0]);

    }
}

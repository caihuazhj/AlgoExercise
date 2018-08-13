package dp;

import java.util.Scanner;

public class LCS {

    public static void lcs(String x,String y){
        char[] s1 = x.toCharArray();
        char[] s2 = y.toCharArray();
        int[][] array = new int[x.length()+1][y.length()+1];//此处的棋盘长度要比字符串长度多加1，需要多存储一行0和一列0

        for(int j = 0; j < array[0].length; j++){//第0行第j列全部赋值为0
            array[0][j] = 0;
        }
        for(int i = 0; i < array.length; i++){//第i行，第0列全部为0
            array[i][0] = 0;
        }

        for(int m = 1; m < array.length; m++){//利用动态规划将数组赋满值
            for(int n = 1; n < array[m].length; n++){
                if(s1[m - 1] == s2[n - 1]){
                    array[m][n] = array[m-1][n-1] + 1;//动态规划公式一
                }else{
                    array[m][n] = Math.max(array[m -1][n], array[m][n -1]);//动态规划公式二
                }
            }
        }

        System.out.println(array[x.length()][y.length()]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        lcs(x,y);
        sc.close();

    }
}

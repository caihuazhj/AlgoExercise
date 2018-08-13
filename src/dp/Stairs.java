package dp;

public class Stairs {

    /**
     * 自顶向下
     * @param n
     * @return
     */
    public static int dpStairs1(int n){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return dpStairs1(n-1)+dpStairs1(n-2);
    }

    /**
     * 自底向上
     * @param n
     * @return
     */
    public static int dpStairs2(int n){

        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int[] r = new int[n+1];
        r[1] = 1;
        r[2] = 2;
        for (int i = 3; i <= n; i++) {
            r[i] = r[i-1] + r[i-2];
        }
        return r[n];
    }

    public static void main(String[] args) {
        System.out.println(dpStairs2(3));
    }
}

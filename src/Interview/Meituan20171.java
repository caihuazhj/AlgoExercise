package Interview;

import java.util.Scanner;

/**
 * 时间限制：1秒

 空间限制：32768K

 大富翁游戏，玩家根据骰子的点数决定走的步数，
 即骰子点数为1时可以走一步，点数为2时可以走两步，点数为n时可以走n步。
 求玩家走到第n步（n<=骰子最大点数且是方法的唯一入参）时，总共有多少种投骰子的方法。
 */
public class Meituan20171 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(fun(n));
        }
    }
    public static int fun(int n){
        int count = 0;
        if(n > 6){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        else{
            for(int i = 1;i < n;i++){
                count = count + fun(n-i);
            }
        }
        count+=1;


        return count;
    }
}

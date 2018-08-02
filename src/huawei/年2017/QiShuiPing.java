package huawei.年2017;

import java.util.Scanner;

public class QiShuiPing {
    public static void main(String[] args) {
        int[] test = new int[10];
        Scanner sc = new Scanner(System.in);
        int i = 0, temp;
        while (i<test.length){
            temp = sc.nextInt();
            if (temp==0){
                break;
            }
            test[i] = temp;
            i++;
        }


        for (int j =0;j<test.length;j++){
            if (test[j]!=0){
                calculate(test[j]);
            }
        }

    }
    public static void calculate(int n){
        int sum = 0;
        while (n/3!=0 && n!=2){
            sum += n/3;
            n = n/3+n%3;
        }
        if (n==2){
            sum++;
        }
        System.out.println(sum);
    }
}

package interviewExercise.huawei.年2016;

import java.util.Scanner;

public class HighestStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = scanner.nextInt();//N个学生
            int M = scanner.nextInt();//M次操作
            int[] score = new int[N];
            //记录每个人的初始成绩
            for (int i=0;i<score.length;i++){
                score[i] = scanner.nextInt();
            }
            for (int j=0;j<M;j++){
                String C  = scanner.next();
                if (C.equals("Q")){
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println(findMax(score,a,b));
                }
                if (C.equals("U")){
                    int s = scanner.nextInt();
                    score[s-1] = scanner.nextInt();//将s的成绩改为第二个值
                }
            }
        }
    }
    //找出数组 从a到b中最大值
    public static int findMax(int[] score,int a,int b){
        int temp = 0;
        int from = a<b?a:b;
        int to = a>b?a:b;
        if (a==b){
           return temp=score[a-1];
        }else{
            for(int i=from-1;i<to;i++){
                if(temp < score[i]){
                    temp = score[i];
                }
            }
        }

        return temp;
    }
}

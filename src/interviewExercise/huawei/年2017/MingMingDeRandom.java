package interviewExercise.huawei.年2017;

import java.util.*;

public class MingMingDeRandom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N= scanner.nextInt();//N个随机数
            int[] rand = new int[N+1];
            for (int i=0;i<N;i++){
                rand[i] = scanner.nextInt();
            }

            bubble(rand);

            for (int i=1;i<N+1;i++){
                if (rand[i]==rand[i-1]){
                    continue;
                }
                System.out.println(rand[i]);
            }
        }

    }
    public static void bubble(int[] array){
        int temp = 0;
        for (int i = 0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

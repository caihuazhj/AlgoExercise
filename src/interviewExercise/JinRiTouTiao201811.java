package interviewExercise;

import java.util.Scanner;

public class JinRiTouTiao201811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] m = new int[n];
            for(int i =0;i<n;i++){
                m[i] = scanner.nextInt();
            }
            int[] temp = m;
            int count = 0;
            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(m[i] - temp[j] == k){
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

}

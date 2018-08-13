package interviewExercise;

import java.util.Scanner;

public class WangYi181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();//n个矩形

            int x1[] = new int[n];
            int y1[] = new int[n];
            int x2[] = new int[n];
            int y2[] = new int[n];
            for (int i=0;i<n;i++){
                x1[i] = scanner.nextInt();
            }
            for (int i=0;i<n;i++){
                y1[i] = scanner.nextInt();
            }
            for (int i=0;i<n;i++){
                x2[i] = scanner.nextInt();
            }
            for (int i=0;i<n;i++){
                y2[i] = scanner.nextInt();
            }

            int count = 0;
            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){

//                    int tempx1 = Math.abs(x2[i]-x1[i]);
//                    int tempx2 = Math.abs(x2[j]-x1[j]);
//                    int tempy1 = Math.abs(y2[i]-y1[i]);
//                    int tempy2 = Math.abs(y2[j]-y1[j]);
//
//                    int tempx =tempx1+tempx2;
//                    if(i ==j){
//                        continue;
//                    }
//                    int tempy = Math.abs(y2[i]-y1[i])+ Math.abs(y2[j]-y1[j]);
//                    if(Math.abs(x2[i]-x1[j])<tempx && Math.abs(y2[i]-y1[j])<tempy){
//                        count++;
//                    }

                }

            }
            System.out.println(count);
        }



    }



}

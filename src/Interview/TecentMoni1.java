package Interview;

import java.util.Scanner;


public class TecentMoni1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            int n = scanner.nextInt();
            int x[][] = new int[n][4];
            int y[][] = new int[n][4];
            for (int i =0;i<n;i++){
                for (int j=0;j<4;j++){
                    x[i][j] = scanner.nextInt();
                }
            }

            for (int i =0;i<n;i++){
                for (int j=0;j<4;j++){
                    y[i][j] = scanner.nextInt();
                }
            }
            System.out.println("finish");
            for(int i = 0;i<n;i++) {
                int d1 = (x[i][0] - x[i][1]) * (x[i][0] - x[i][1]) + (y[i][0] - y[i][1]) * (y[i][0] - y[i][1]);
                int d2 = (x[i][1] - x[i][2]) * (x[i][1] - x[i][2]) + (y[i][1] - y[i][2]) * (y[i][1] - y[i][2]);
                int d3 = (x[i][2] - x[i][3]) * (x[i][2] - x[i][3]) + (y[i][2] - y[i][3]) * (y[i][2] - y[i][3]);
                int d4 = (x[i][3] - x[i][0]) * (x[i][3] - x[i][0]) + (y[i][3] - y[i][0]) * (y[i][3] - y[i][0]);
                if(d1==d2&& d2==d3&& d3==d4&& d4==d1){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }

        }





    }
}


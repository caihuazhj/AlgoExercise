package Interview;

import java.util.Scanner;

public class Meituan0420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int p = scanner.nextInt();

            int[] A = new int[N];
            A[1] = p;
            for (int k=2;k<N;k++){
                A[k] = (A[k-1]+ 153)%p;
            }


            int count = 0;
            for (int i=1;i<=m;i++){
                for(int j=1;j<=i;j++){
                    int pp = GCD_base(i,j);
                    System.out.println(j);
                    if (j<i){
                        count = A[pp]*2;
                        System.out.println("111"+count);
                    }else{
                        count += A[pp];
                        System.out.println(count);
                    }

                }
            }
            System.out.println(count);


    }


    public static int  GCD_base(int a,int b)
    {
        int r;
        while(b>0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}

package sort;

import java.util.Scanner;

public class InsertSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            char[] c = s.toCharArray();
            int n = s.length();
            char temp;
            //假设第一个已经有序
            for(int i=1;i<n;i++){
                int j =i;
                temp = c[i];
                //比较，并交换
                while(j>0 &&temp < c[j-1]){
                    c[j] = c[j-1];
                    j--;
                }
                c[j] = temp;
            }
            //输出
            for (int i =0;i<c.length;i++){
                System.out.println(c[i]);
            }
        }
    }
}
